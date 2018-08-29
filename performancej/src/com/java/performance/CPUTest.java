package com.java.performance;

public class CPUTest {
    public static class BadThread extends Thread {
        long count = 0;

        @Override
        public void run() {
            while (true) {
                this.count++;
            }
        }
    }

    public static class GoodThread extends Thread {
        long count = 0;

        @Override
        public void run() {
            while (true) {
                this.count++;
                if ((this.count % 100_00) == 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(final String[] args) {
        for (int i = 0; i < 2; i++) {
            BadThread badThread = new BadThread();
            badThread.start();
        }
        for (int i = 0; i < 4; i++) {
            GoodThread badThread = new GoodThread();
            badThread.start();
        }
    }
}
