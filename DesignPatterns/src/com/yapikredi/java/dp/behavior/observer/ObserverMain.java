package com.yapikredi.java.dp.behavior.observer;

public class ObserverMain {
	public static void main(final String[] args) {
		AlarmDist alarmDist = new AlarmDist();
		alarmDist.registerAlarmHandler(new Lights());
		alarmDist.registerAlarmHandler(new Gate());
		alarmDist.registerAlarmHandler(new AlarmSound());

		alarmDist.alarmOn();
		System.out.println("---------------------");
		alarmDist.alarmOff();

	}
}
