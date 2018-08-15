package com.metod.java.training.arrays;

public class ArrayMain {
    public static void main(final String[] args) {
        String[] strArray = new String[10];
        strArray[0] = "osman1";
        strArray[1] = "osman2";
        strArray[2] = "osman3";
        strArray[3] = "osman4";

        String[] strArrayNew = new String[15];
        int counter = 0;
        for (String string : strArray) {
            strArrayNew[counter++] = string;
        }

        int[] intArray = new int[10];
        int i9 = intArray[8];
    }
}
