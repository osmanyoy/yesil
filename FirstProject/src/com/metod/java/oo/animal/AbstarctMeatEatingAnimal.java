package com.metod.java.oo.animal;

public abstract class AbstarctMeatEatingAnimal extends AbstractAnimal {

    public AbstarctMeatEatingAnimal(final String talkString) {
        super(talkString);
    }

    @Override
    public String eat() {
        return "Meat";
    }

}
