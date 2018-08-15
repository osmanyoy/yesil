package com.metod.java.training.collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(final String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("osman1");
        set1.add("osman2");
        set1.add("osman3");
        set1.add("osman4");
        set1.add("osman5");
        set1.add("osman5");
        set1.add("osman5");
        set1.add("osman5");
        set1.add("osman5");
        System.out.println(set1);

        for (String string : set1) {

        }

        Set<MySetObj> set2 = new HashSet<>();

        MySetObj ob1 = new MySetObj();
        ob1.setA(100);
        ob1.setString("osman");
        set2.add(ob1);

        MySetObj ob2 = new MySetObj();
        ob2.setA(100);
        ob2.setString("osman");
        set2.add(ob2);

        if (ob1.equals(ob2)) {
            System.out.println("Equals : EVET");
        } else {
            System.out.println("Equals : HAYIR");
        }

        System.out.println("Set 2 : " + set2);
    }
}
