package com.java.performance;

import java.util.concurrent.CountDownLatch;

public class CounterTest {
    public static class CounterThread extends Thread {
        // private static AtomicLong counter = new AtomicLong();
        private static long counter = 0;
        private CountDownLatch countDownLatch;
        private long c_counter;

        public CounterThread(final CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        private Object counterLock = new Object();
        private Object otherLock = new Object();

        private void count() {
            synchronized (this.counterLock) {
                CounterThread.counter++;
            }
        }

        private void otherMethod() {
            synchronized (this.otherLock) {
                System.out.println("tets");
            }
        }

        private static synchronized void countStatic() {
            CounterThread.counter++;
        }

        @Override
        public void run() {
            long delta = System.nanoTime();
            for (int i = 0; i < 100_000_000; i++) {
                // CounterThread.counter.incrementAndGet();
                CounterThread.countStatic();
                this.c_counter++;
            }
            delta = System.nanoTime() - delta;
            System.out.println("StringTest Delta : " + delta);
            this.countDownLatch.countDown();
        }

        public long getC_counter() {
            return this.c_counter;
        }

        public void setC_counter(final long c_counter) {
            this.c_counter = c_counter;
        }
    }

    public static void main(final String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        CounterThread[] cArray = new CounterThread[4];
        for (int i = 0; i < 4; i++) {
            cArray[i] = new CounterThread(countDownLatch);
            cArray[i].start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int totalCounter = 0;
        for (int i = 0; i < cArray.length; i++) {
            totalCounter += cArray[i].getC_counter();
        }
        System.out.println("Counter : " + totalCounter);
    }
}
