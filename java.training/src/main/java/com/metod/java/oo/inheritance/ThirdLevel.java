package com.metod.java.oo.inheritance;

public class ThirdLevel extends SecondLevel {
    protected int value1;
    protected String value2;

    public ThirdLevel() {
        System.out.println("third level constructor");
    }

    public String method4() {
        return "third level method4";
    }

}
