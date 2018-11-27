package com.training.dp.common;


public class Customer {

    private String name;
    private int    tlAmount;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public int getTlAmount() {
        return this.tlAmount;
    }

    public void setTlAmount(final int tlAmountParam) {
        this.tlAmount = tlAmountParam;
    }

    @Override
    public String toString() {
        return "Customer [name=" + this.name + ", tlAmount=" + this.tlAmount + "]";
    }


}
