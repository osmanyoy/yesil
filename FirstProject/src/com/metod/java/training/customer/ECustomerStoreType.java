package com.metod.java.training.customer;

public enum ECustomerStoreType {
    TYPE1(10, 10, 20), TYPE2(15, 15, 30), TYPE3(20, 20, 50);

    private final int customer1Limit;
    private final int customer2Limit;
    private final int customer3Limit;

    private ECustomerStoreType(final int customer1Limit, final int customer2Limit, final int customer3Limit) {
        this.customer1Limit = customer1Limit;
        this.customer2Limit = customer2Limit;
        this.customer3Limit = customer3Limit;

    }

    public int getCustomer1Limit() {
        return this.customer1Limit;
    }

    public int getCustomer2Limit() {
        return this.customer2Limit;
    }

    public int getCustomer3Limit() {
        return this.customer3Limit;
    }

}
