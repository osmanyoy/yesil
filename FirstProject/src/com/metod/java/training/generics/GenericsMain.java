package com.metod.java.training.generics;

public class GenericsMain {
    public static void main(final String[] args) {
        MyGenericClass class1 = new MyGenericClass();
        class1.setValue(new Integer(100));
        class1.setValue("sýdsudýsud");
        class1.setValue(1000L);

        Object value = class1.getValue();
        if (value instanceof Long) {
            Long lVal = (Long) value;
        }

        MyGenericsObject<Long> genericsObject = new MyGenericsObject<>();
        genericsObject.setValue(1000L);
        Long value2 = genericsObject.getValue();

        MyGenericsObject<String> sGenericsObject = new MyGenericsObject<>();
        sGenericsObject.setValue("dfdsfdf");
        String value3 = sGenericsObject.getValue();
    }
}
