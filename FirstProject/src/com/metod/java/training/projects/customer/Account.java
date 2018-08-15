package com.metod.java.training.projects.customer;

public class Account {
    private EAccountType accountType;
    private double amount;
    private String description;

    public Account() {
    }

    public Account(final EAccountType accountType, final double amount, final String description) {
        super();
        this.accountType = accountType;
        this.amount = amount;
        this.description = description;
    }

    public EAccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(final EAccountType accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n    Account [accountType=" + this.accountType + ", amount=" + this.amount + ", description="
                + this.description + "]";
    }

}
