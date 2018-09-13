package com.yapikredi.java.dp.behavior.observer;

public class AlarmSound implements IAlarm {
	public void on() {
		System.out.println("Alarm sound on");
	}

	public void off() {
		System.out.println("Alarm sound off");
	}

	@Override
	public void alarmOn() {
		this.on();
	}

	@Override
	public void alarmOff() {
		this.off();

	}

}
