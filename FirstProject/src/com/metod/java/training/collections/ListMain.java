package com.metod.java.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(final String[] args) {
        List<String> list = new ArrayList<>();
        long delta = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            list.add("osman");
        }
        System.out.println("Delta List add : " + (System.currentTimeMillis() - delta));

        for (String string : list) {

        }

        for (int i = 0; i < 10_000_000; i++) {
            String string = list.get(i);
        }

        delta = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            list.get(i);
        }
        System.out.println("Delta List get : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.remove(0);
        }
        System.out.println("Delta List remove : " + (System.currentTimeMillis() - delta));
    }
}
