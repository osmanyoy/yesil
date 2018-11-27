package com.yapikredi.java.dp.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmDist implements IAlarm {

    private volatile static AlarmDist instance;

    public static AlarmDist getInstance() {
        if (AlarmDist.instance == null) {
            synchronized (AlarmDist.class) {
                if (AlarmDist.instance == null) {
                    AlarmDist.instance = new AlarmDist();
                }
            }
        }
        return AlarmDist.instance;
    }


    private final List<IAlarm> registeredAlarmHandlers = new ArrayList<>();


    public AlarmDist() {
        this.registerAlarmHandler(new Lights());
        this.registerAlarmHandler(new Gate());
        this.registerAlarmHandler(new AlarmSound());
    }

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
