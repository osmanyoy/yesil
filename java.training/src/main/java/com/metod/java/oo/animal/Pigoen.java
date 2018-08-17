package com.metod.java.oo.animal;

public class Pigoen extends AbstractAnimal {

    public Pigoen() {
        super("guk");
    }

    @Override
    public String move() {
        return "uçma";
    }

    @Override
    public String eat() {
        return "yem";
    }

}
