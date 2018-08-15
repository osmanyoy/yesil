package com.metod.java.oo;

public class MyImpl1 implements IMyInterface {

    @Override
    public String method1() {
        return "method 1";
    }

    @Override
    public int method2(final int value) {
        return value + 1;
    }

    @Override
    public int method3(final int val1, final int val2) {
        return val1 + val2;
    }

    public String otherMethod1() {
        return "OTHER1";
    }

}
