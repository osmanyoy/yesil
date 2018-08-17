package com.metod.java.training;

public class MyFirstObject3 {

    private int intValue;
    private int intValue2 = 15;
    private int intValue3 = 15;
    private int intValue4 = 15;
    private int intValue5 = 15;
    private int intValue6 = 15;
    private int intValue7 = 15;
    private int intValue8 = 15;
    private int intValue9 = 15;
    private int intValue10 = 15;
    private int intValue11 = 15;

    private MyFirstObject3() {
    }

    public static MyFirstObject3Builder getBuilder() {
        return new MyFirstObject3Builder();
    }

    public static class MyFirstObject3Builder {
        private MyFirstObject3 myFirstObject3;

        private MyFirstObject3Builder() {
            this.myFirstObject3 = new MyFirstObject3();
        }

        public MyFirstObject3Builder withIntValue(final int value) {
            this.myFirstObject3.intValue = value;
            return this;
        }

        public MyFirstObject3Builder withIntValue2(final int value) {
            this.myFirstObject3.intValue2 = value;
            return this;
        }

        public MyFirstObject3Builder withIntValue3(final int value) {
            this.myFirstObject3.intValue3 = value;
            return this;
        }

        public MyFirstObject3Builder withIntValue4(final int value) {
            this.myFirstObject3.intValue4 = value;
            return this;
        }

        public MyFirstObject3Builder withIntValue5(final int value) {
            this.myFirstObject3.intValue5 = value;
            return this;
        }

        public MyFirstObject3 buildType1Object() throws MyFirstObject3CreationException {
            if (this.myFirstObject3.intValue5 == 0) {
                throw new MyFirstObject3CreationException("intValue5 can not be 0");
            }
            if (this.myFirstObject3.intValue < 0) {
                throw new MyFirstObject3CreationException("intValue can not be negative");
            }
            return this.myFirstObject3;
        }

    }

    private void method1() {

    }

    public int getIntValue() {
        return this.intValue;
    }

    public void setIntValue(final int intValue) {
        if (intValue < 0) {
            this.intValue = 1;
        } else {
            this.intValue = intValue;
        }
    }

}
