package com.metod.java.training;

public class Runner {

    public static void main(final String[] args) {
        MyFirstObject myFirstObject = new MyFirstObject(100);
        myFirstObject.setIntValue(-11);
        System.out.println("intValue : " + myFirstObject.getIntValue());

        MyFirstObject2 createTip1Object = MyFirstObject2.createTip1Object(10, 20, 30, 40, 50);

        MyFirstObject firstObject = new MyFirstObject(10,
                                                      20,
                                                      30,
                                                      40,
                                                      50);

        MyFirstObject3 buildType1Object = MyFirstObject3.getBuilder()
                                                        .withIntValue(10)
                                                        .withIntValue2(20)
                                                        .withIntValue3(30)
                                                        .withIntValue4(40)
                                                        .withIntValue5(50)
                                                        .buildType1Object();
    }

}
