package com.yapikredi.java.dp.behavior.iterator;

import java.util.Iterator;

public class IteratorRunner {

    public static void main(final String[] args) {
        MyObject myObjectLoc = new MyObject();

        Iterator<String> itretorLoc = myObjectLoc.getItretor();
        while (itretorLoc.hasNext()) {
            String nextLoc = itretorLoc.next();
            System.out.println(nextLoc);
        }
    }
}
