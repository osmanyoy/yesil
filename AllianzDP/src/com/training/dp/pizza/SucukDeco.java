package com.training.dp.pizza;


public class SucukDeco implements IPizza {

    private final IPizza pizza;

    public SucukDeco(final IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 0.5D;
    }

}
