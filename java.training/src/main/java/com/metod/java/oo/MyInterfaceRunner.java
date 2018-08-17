package com.metod.java.oo;

public class MyInterfaceRunner {
    public static void main(final String[] args) {
        int index = 2;
        IMyInterface myImpl1;
        if (index == 1) {
            myImpl1 = new MyImpl1();
        } else if (index == 2) {
            myImpl1 = new MyImpl2();
        } else if (index == 3) {
            myImpl1 = new MyImpl3();
        } else {
            myImpl1 = new MyImpl1();
        }

        System.out.println("method1 : " + myImpl1.method1());
        System.out.println("method2 : " + myImpl1.method2(10));
        System.out.println("method3 : " + myImpl1.method3(10, 20));
    }
}
