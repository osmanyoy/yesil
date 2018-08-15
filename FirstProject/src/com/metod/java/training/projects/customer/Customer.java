package com.metod.java.training.projects.customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String username;
    private String password;
    private String name;
    private String surname;
    private List<Account> accounts = new ArrayList<>();

    public Customer() {
    }

    public Customer(final String username, final String password, final String name, final String surname) {
        super();
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public void addAccount(final Account account) {
        this.accounts.add(account);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    @Override
    public String toString() {
        return "Customer [username=" + this.username + ", password=" + this.password + ", name=" + this.name
                + ", surname=" + this.surname + "\n accounts=" + this.accounts + "\n]";
    }

    public void setAccounts(final List<Account> accounts) {
        this.accounts = accounts;
    }

}
