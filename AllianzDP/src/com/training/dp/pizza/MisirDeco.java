package com.training.dp.pizza;


public class MisirDeco implements IPizza {

    private final IPizza pizza;

    public MisirDeco(final IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 0.2D;
    }

}
