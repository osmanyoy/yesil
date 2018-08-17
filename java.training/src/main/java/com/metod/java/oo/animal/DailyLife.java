package com.metod.java.oo.animal;

public class DailyLife {
    private IAnimal animal;

    public DailyLife(final IAnimal animal) {
        super();
        this.animal = animal;
    }

    public void liveADay() {
        System.out.println(this.animal.eat());
        System.out.println(this.animal.move());
        System.out.println(this.animal.talk());
        System.out.println(this.animal.sleep());
    }

}
