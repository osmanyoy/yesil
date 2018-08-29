package com.java.performance;

public class StringTest {

    // public static Map<String, String> map = new HashMap<>();

    public static void main(final String[] args) {
        long delta = System.nanoTime();
        for (int i = 0; i < 10_000_000; i++) {
            String string = "test str " + i;
            // StringTest.map.put("s1" + i, string);
        }
        delta = System.nanoTime() - delta;
        System.out.println("StringTest Delta : " + delta);

        System.gc();
        try {
            Thread.sleep(2_000);
        } catch (Exception e) {
        }

        delta = System.nanoTime();
        for (int i = 0; i < 10_000_000; i++) {
            String string = "test str " + i + " devam " + i;
            // iþlemler
            string += "hhh" + i;
            string += "zzz" + i;
            // StringTest.map.put("s2" + i, string);
        }
        delta = System.nanoTime() - delta;
        System.out.println("StringTest Delta : " + delta);

        System.gc();
        try {
            Thread.sleep(2_000);
        } catch (Exception e) {
        }

        delta = System.nanoTime();
        for (int i = 0; i < 10_000_000; i++) {
            StringBuilder buffer = new StringBuilder(100);
            buffer.append("test str ");
            buffer.append(i);
            buffer.append(" devam ");
            buffer.append(i);
            buffer.append("hhh");
            buffer.append(i);
            buffer.append("zzz");
            buffer.append(i);
            String string = buffer.toString();
        }
        delta = System.nanoTime() - delta;
        System.out.println("StringTest StringBuffer Delta : " + delta);

        System.gc();
        try {
            Thread.sleep(2_000);
        } catch (Exception e) {
        }

        delta = System.nanoTime();
        for (int i = 0; i < 10_000_000; i++) {
            String string = String.format("test str %d devam %d hhh%dzzz%d", i, i, i, i);
            // StringTest.map.put("s3" + i, string);
        }
        delta = System.nanoTime() - delta;
        System.out.println("StringTest Format Delta : " + delta);

        delta = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            if (i < 10001) {

            }
        }
        delta = System.nanoTime() - delta;
        System.out.println("StringTest if Delta : " + delta);

    }
}
