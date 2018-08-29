package com.java.performance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(final String[] args) {
        WriteThread writeThread = new WriteThread();
        writeThread.start();

        ReadThread readThread = new ReadThread();
        readThread.start();

        List<String> stringList = new LinkedList<>();

        // List<String> synchronizedList = Collections.synchronizedList(stringList);

        long delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            stringList.add("test str" + i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Delta : " + delta);

        System.gc();
        try {
            Thread.sleep(2_000);
        } catch (Exception e) {
        }

        stringList = new LinkedList<>();
        delta = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            stringList.add("test str" + i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Delta : " + delta);

        delta = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            stringList.get(i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Get Delta : " + delta);

        delta = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            stringList.remove(0);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Remove Delta : " + delta);

    }

    public static List<String> strList = Collections.synchronizedList(new ArrayList<>());

    public static class WriteThread extends Thread {

        @Override
        public void run() {

            for (int i = 0; i < 1_000; i++) {
                ListTest.strList.add("tst str " + i);
            }

        }
    }

    public static class ReadThread extends Thread {

        @Override
        public void run() {
            for (String string : ListTest.strList) {
                System.out.println("Result : " + string);
            }
        }
    }

}
