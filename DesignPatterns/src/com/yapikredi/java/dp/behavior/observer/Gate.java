package com.yapikredi.java.dp.behavior.observer;

public class Gate implements IAlarm {
	public void open() {
		System.out.println("Gate open");
	}

	public void close() {
		System.out.println("Gate open");

	}

	@Override
	public void alarmOn() {
		this.open();
	}

	@Override
	public void alarmOff() {

	}
}
