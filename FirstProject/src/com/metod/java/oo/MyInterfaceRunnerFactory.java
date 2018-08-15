package com.metod.java.oo;

public class MyInterfaceRunnerFactory {
    public static void main(final String[] args) {
        int index = 2;
        IMyInterface myImpl1 = IMyInterfaceFactory.createImpl(index);

        System.out.println("method1 : " + myImpl1.method1());
        System.out.println("method2 : " + myImpl1.method2(10));
        System.out.println("method3 : " + myImpl1.method3(10, 20));
    }
}
