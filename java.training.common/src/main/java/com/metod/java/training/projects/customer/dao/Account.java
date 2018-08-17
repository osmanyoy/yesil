package com.metod.java.training.projects.customer.dao;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private long accountId;

    private EAccountType accountType;
    private double amount;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Customer customer;

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

    public long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(final long accountId) {
        this.accountId = accountId;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

}
