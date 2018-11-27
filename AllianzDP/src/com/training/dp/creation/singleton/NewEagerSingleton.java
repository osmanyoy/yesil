package com.training.dp.creation.singleton;


public enum NewEagerSingleton {
    INSTANCE,
    INSTANCE2 {

        @Override
        public String hello() {
            return "hello test";
        }
    };

    public String hello() {
        return "Hello";
    }

}
