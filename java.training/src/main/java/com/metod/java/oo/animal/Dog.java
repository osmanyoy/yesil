package com.metod.java.oo.animal;

public class Dog extends AbstarctMeatEatingAnimal {

    public Dog() {
        super("hav hav");
    }

    @Override
    public String move() {
        return "dört ayak yürü";
    }

}
