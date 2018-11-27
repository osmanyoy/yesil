package com.training.dp.pizza;


public class ZeytinDeco implements IPizza {

    private final IPizza pizza;

    public ZeytinDeco(final IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 0.2D;
    }

}
