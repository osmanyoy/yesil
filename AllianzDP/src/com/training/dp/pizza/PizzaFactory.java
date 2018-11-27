package com.training.dp.pizza;


public class PizzaFactory {

    public static IPizza createPizza(final int index) {
        switch (index) {
            case 1:
                return new KucukPizza();
            case 2:
                return new BuyukPizza();

            default:
                return new KucukPizza();
        }
    }
}
