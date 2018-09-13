package com.yapikredi.java.dp.behavior.observer;

public class Lights implements IAlarm {
	public void on() {
		System.out.println("Lights on");
	}

	public void off() {
		System.out.println("Lights off");
	}

	public void dim() {
		System.out.println("Lights off");
	}

	@Override
	public void alarmOn() {
		this.on();
	}

	@Override
	public void alarmOff() {

	}

}
