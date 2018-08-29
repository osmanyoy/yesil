package com.java.performance;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(final String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>(120_000,
                                                          0.9f,
                                                          1000);
        long delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            String value = "test str" + i;
            map.put(value, value);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Delta : " + delta);

        System.gc();
        try {
            Thread.sleep(2_000);
        } catch (Exception e) {
        }

        delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            String value = "test str" + i;
            map.put(value, value);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest Delta : " + delta);

        delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            String value = "test str" + i;
            String string = map.get(value);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest get Delta : " + delta);

        delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            map.remove("test str" + i);
        }
        delta = System.nanoTime() - delta;
        System.out.println("ListTest remove Delta : " + delta);

    }
}
