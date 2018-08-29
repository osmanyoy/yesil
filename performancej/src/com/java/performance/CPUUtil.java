package com.java.performance;

public class CPUUtil {

    public static class CounterThread extends Thread {
        @Override
        public void run() {
            long count = 0;
            while (true) {
                count++;
                if ((count % 500_000) == 0) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        }
    }

    public static void main(final String[] args) {
        for (int i = 0; i < 4; i++) {
            CounterThread counterThread = new CounterThread();
            counterThread.start();
        }
    }

}
