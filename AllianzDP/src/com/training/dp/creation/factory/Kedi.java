package com.training.dp.creation.factory;


public class Kedi extends Animal {

    @Override
    public String eat() {
        return "kedi mamasý";
    }

    @Override
    public String voice() {
        return "miyav";
    }
}
