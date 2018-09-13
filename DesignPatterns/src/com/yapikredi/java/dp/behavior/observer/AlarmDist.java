package com.yapikredi.java.dp.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmDist implements IAlarm {
	private List<IAlarm> registeredAlarmHandlers = new ArrayList<>();

	public void registerAlarmHandler(final IAlarm alarm) {
		this.registeredAlarmHandlers.add(alarm);
	}

	@Override
	public void alarmOn() {
		for (IAlarm iAlarm : this.registeredAlarmHandlers) {
			iAlarm.alarmOn();
		}
	}

	@Override
	public void alarmOff() {
		for (IAlarm iAlarm : this.registeredAlarmHandlers) {
			iAlarm.alarmOff();
		}
	}

}
