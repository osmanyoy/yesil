package com.training.dp.creation.general;


public class CustomerSufixDeco extends Customer {

    private final Customer customer;

    public CustomerSufixDeco(final Customer customerParam) {
        this.customer = customerParam;
    }

    @Override
    public String getName() {
        return this.customer.getName();
    }

    @Override
    public String getSurname() {
        return this.customer.getSurname() + " hazretleri";
    }
}
