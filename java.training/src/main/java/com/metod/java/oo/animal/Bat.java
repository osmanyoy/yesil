package com.metod.java.oo.animal;

public class Bat extends AbstractAnimal {

    public Bat() {
        super("zzzzz");
    }

    @Override
    public String move() {
        return "dört ayak yürü";
    }

    @Override
    public String eat() {
        return "insects";
    }

    @Override
    public String sleep() {
        return "not sleep";
    }

}
