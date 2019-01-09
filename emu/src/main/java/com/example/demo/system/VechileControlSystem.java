package com.example.demo.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.SystemCounter;
import com.example.demo.eventman.EmptyTankEvent;
import com.example.demo.model.Vechile;

@Component
public class VechileControlSystem {

	@Autowired
	private SystemCounter sysCounter;

	@EventListener(classes = EmptyTankEvent.class)
	public void handleEvent(final EmptyTankEvent appEventParam) {
		Vechile vechile = appEventParam.getVechile();
		if (!vechile.isFillInProgress()) {
			vechile.setFillInProgress(true);
			vechile.setFillUntilIndex(sysCounter.getIndex() + 2);
		}

	}
	

}
