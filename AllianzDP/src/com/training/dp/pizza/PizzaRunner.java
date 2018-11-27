package com.training.dp.pizza;

import java.util.Arrays;

public class PizzaRunner {

    public static final int KUCUK_PIZZA = 1;


    public static void main(final String[] args) {
        IPizza pizza2Loc = EPizzaType.BUYUK.getPizza();

        EPizzaType ePizzaTypeLoc = EPizzaType.KUCUK;
        IPizza pizza3Loc = ePizzaTypeLoc.getPizza();

        IPizza pizzaLoc = PizzaFactory.createPizza(PizzaRunner.KUCUK_PIZZA);
        pizzaLoc = DecoratorFactory.createPizza(Arrays.asList(1,
                                                              1,
                                                              2,
                                                              3),
                                                pizzaLoc);
        System.out.println(pizzaLoc.getCost());
    }
}
