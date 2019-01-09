package com.example.demo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationEventMulticaster;

import com.example.demo.eventman.EmptyTankEvent;
import com.example.demo.eventman.HeartBeatEvent;

public abstract class Vechile implements ApplicationListener<HeartBeatEvent> {

	private Logger logger = LoggerFactory.getLogger(Vechile.class);

	private EVechileType vechileType;
	private float remainingGas;
	private ApplicationEventMulticaster aem;
	private boolean fillInProgress = false;
	private long fillUntilIndex = -1;
	private String name;

	public Vechile(String name, EVechileType vechileTypeParam, ApplicationEventMulticaster aemParam) {
		this.name = name;
		vechileType = vechileTypeParam;
		remainingGas = vechileType.getTankSize();
		aem = aemParam;
		aem.addApplicationListener(this);
	}

	@Override
	public void onApplicationEvent(HeartBeatEvent event) {
		if (fillInProgress) {
			long index = event.getIndex();
			if (logger.isDebugEnabled()) {
				logger.debug("Vechile : " + name + " fill in progress and current index : " + index + " fillUntil : "
				        + fillUntilIndex);
			}

			if (index >= fillUntilIndex) {
				fillInProgress = false;
				remainingGas = vechileType.getTankSize();
			}
		} else {
			remainingGas -= vechileType.getAvarageConsumption();
			if (logger.isDebugEnabled()) {
				logger.debug("Vechile : " + name + " remaining gas : " + remainingGas);
			}
			if (remainingGas < (vechileType.getTankSize() / 10)) {
				EmptyTankEvent emptyTankEvent = new EmptyTankEvent();
				emptyTankEvent.setRemainingGas(remainingGas);
				emptyTankEvent.setVechile(this);
				aem.multicastEvent(emptyTankEvent);
			}
		}
	}

	public boolean isFillInProgress() {
		return fillInProgress;
	}

	public void setFillInProgress(boolean fillInProgress) {
		this.fillInProgress = fillInProgress;
	}

	public long getFillUntilIndex() {
		return fillUntilIndex;
	}

	public void setFillUntilIndex(long fillUntilIndex) {
		this.fillUntilIndex = fillUntilIndex;
	}

}
