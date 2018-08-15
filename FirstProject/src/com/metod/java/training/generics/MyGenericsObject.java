package com.metod.java.training.generics;

public class MyGenericsObject<T> {
    private T value;

    public T getValue() {
        return this.value;
    }

    public void setValue(final T value) {
        this.value = value;
    }

}
