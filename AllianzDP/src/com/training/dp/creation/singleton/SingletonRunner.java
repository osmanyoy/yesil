package com.training.dp.creation.singleton;


public class SingletonRunner {

    public static void main(final String[] args) {
        String helloLoc = MySingleton.getInstance()
                                     .hello();
        System.out.println(helloLoc);

        String hello2Loc = LazySingleton.getInstance()
                                        .hello();

        String hello3Loc = NewEagerSingleton.INSTANCE.hello();
        NewEagerSingleton.INSTANCE2.hello();


    }
}
