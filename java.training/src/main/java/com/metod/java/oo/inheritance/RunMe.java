package com.metod.java.oo.inheritance;

public class RunMe {
    public static void main(final String[] args) {
        SecondLevel thirdLevel = new ThirdLevel();
        thirdLevel.value1 = 10;
        thirdLevel.value2 = "osman";

        System.out.println(thirdLevel.method1());
        System.out.println(thirdLevel.method2());
        // System.out.println(thirdLevel.method3());
        // System.out.println(thirdLevel.method4());
    }
}
