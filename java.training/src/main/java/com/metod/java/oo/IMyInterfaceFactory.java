package com.metod.java.oo;

public class IMyInterfaceFactory {
    public static IMyInterface createImpl(final int index) {
        IMyInterface myInterface;
        switch (index) {
        case 1:
            myInterface = new MyImpl1();
            break;
        case 2:
            myInterface = new MyImpl2();
            break;
        case 3:
            myInterface = new MyImpl3();
            break;

        default:
            myInterface = new MyImpl1();
            break;
        }
        return myInterface;
    }
}
