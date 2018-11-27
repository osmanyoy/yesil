package com.training.dp.creation.singleton;


public class MySingleton {

    private static MySingleton instance = new MySingleton();

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        return MySingleton.instance;
    }

    public String hello() {
        return "Hello";
    }

}
