package com.training.dp.pizza;


public enum EPizzaType implements ITestEnum {
    KUCUK {

        @Override
        public IPizza getPizza() {
            return new KucukPizza();
        }

        @Override
        public String test() {
            return "mest";
        }
    },
    BUYUK {

        @Override
        public IPizza getPizza() {
            return new BuyukPizza();
        }
    };

    public IPizza getPizza() {
        throw new IllegalAccessError();
    }

    public String test() {
        return "test";
    }

    @Override
    public String hello() {
        return "hello";
    }
}
