package com.metod.java.oo.inheritance;

public class FirstLevel {
    protected int value1;
    protected String value2;

    public FirstLevel() {
        System.out.println("first level constructor");
    }

    public String method1() {
        return "first level method1 : " + this.value1;
    }

    public String method2() {
        return "first level method2 : " + this.value2;
    }

}
