package com.metod.java.oo.inheritance;

public class SecondLevel extends FirstLevel {
    protected int value1;
    protected String value2;

    public SecondLevel() {
        System.out.println("second level constructor");
    }

    @Override
    public String method1() {
        String method1 = super.method1();
        return method1 + "second level method1 : " + this.value1;
    }

    @Override
    public String method2() {
        return "second level method2 : " + this.value2;
    }

    public String method3() {
        return "second level method3";
    }

}
