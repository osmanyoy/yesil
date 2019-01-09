package com.example.demo.eventman;

import org.springframework.context.ApplicationEvent;

import com.example.demo.model.Vechile;

public class EmptyTankEvent extends ApplicationEvent{

	private static final long serialVersionUID = 4939990986618611229L;

	private float remainingGas;
	private Vechile vechile;
	
	public EmptyTankEvent() {
		super(EmptyTankEvent.class);
	}

	public float getRemainingGas() {
		return remainingGas;
	}

	public void setRemainingGas(float remainingGas) {
		this.remainingGas = remainingGas;
	}

	public Vechile getVechile() {
		return vechile;
	}

	public void setVechile(Vechile vechile) {
		this.vechile = vechile;
	}
}
