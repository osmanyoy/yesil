package com.metod.java.training;

public class MicroBench {

    public static class MyTest {
        public String test1() {
            return "osman";
        }

        public String test2() {
            throw new IllegalArgumentException();
        }

    }

    public static void main(final String[] args) {

        MyTest myTest = new MyTest();
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            myTest.test1();
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - currentTimeMillis));

        currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            try {
                myTest.test2();
            } catch (Exception e) {
            }
        }
        System.out.println("Delta exception : " + (System.currentTimeMillis() - currentTimeMillis));

    }

}
