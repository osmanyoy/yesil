package com.yapikredi.java.dp.behavior.observer;

public class ObserverMain {

    public static void main(final String[] args) {
        AlarmDist alarmDist = new AlarmDist();

        alarmDist.alarmOn();
        System.out.println("---------------------");
        alarmDist.alarmOff();

    }
}
