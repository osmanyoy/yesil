package com.metod.java.oo.animal;

public abstract class AbstractAnimal implements IAnimal {

    private String talkString;

    public AbstractAnimal(final String talkString) {
        this.talkString = talkString;

    }

    @Override
    public String sleep() {
        return "sleep";
    }

    @Override
    public String talk() {
        return this.talkString;
    }

}
