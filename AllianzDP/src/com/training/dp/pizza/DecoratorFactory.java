package com.training.dp.pizza;

import java.util.List;

public class DecoratorFactory {

    public static IPizza createPizza(final List<Integer> indexes,
                                     final IPizza iPizzaParam) {
        IPizza myPizza = iPizzaParam;
        for (Integer integerLoc : indexes) {
            switch (integerLoc) {
                case 1:
                    myPizza = new ZeytinDeco(myPizza);
                    break;
                case 2:
                    myPizza = new SucukDeco(myPizza);
                    break;
                case 3:
                    myPizza = new MisirDeco(myPizza);
                    break;
                default:
                    myPizza = myPizza;
            }
        }
        return myPizza;
    }
}
