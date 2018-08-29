package com.java.performance;

import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(final String[] args) {
        MyTestObj myTestObj = new MyTestObj();

        long delta = System.nanoTime();
        for (int i = 0; i < 10_000_000; i++) {
            myTestObj.test();
        }
        delta = System.nanoTime() - delta;
        System.out.println("Normal Delta : " + delta);

        Method[] methods = MyTestObj.class.getDeclaredMethods();
        Method testMethod = null;
        for (Method method : methods) {
            if (method.getName()
                      .equals("test")) {
                testMethod = method;
            }
        }

        try {
            MyTestObj newInstance = MyTestObj.class.newInstance();
            delta = System.nanoTime();
            for (int i = 0; i < 10_000_000; i++) {
                testMethod.invoke(newInstance, null);
            }
            delta = System.nanoTime() - delta;
            System.out.println("Reflection Delta : " + delta);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
