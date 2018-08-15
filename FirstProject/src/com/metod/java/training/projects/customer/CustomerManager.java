package com.metod.java.training.projects.customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private Map<String, Customer> customerMap = new HashMap<>();

    public void addCustomer(final Customer customer) {
        this.customerMap.put(customer.getUsername(), customer);
    }

    public Customer getCustomer(final String username) {
        return this.customerMap.get(username);
    }

    public void fillRandomCustomers() {
        Customer customer = new Customer("osman",
                                         "1234",
                                         "osman",
                                         "aya");
        customer.addAccount(new Account(EAccountType.EURO,
                                        1000,
                                        "osman EURO account"));
        customer.addAccount(new Account(EAccountType.TL,
                                        10000,
                                        "osman TL account"));

        this.customerMap.put(customer.getUsername(), customer);

        customer = new Customer("mehmet",
                                "1234",
                                "mehmet",
                                "aya");
        customer.addAccount(new Account(EAccountType.DOLAR,
                                        1000,
                                        "mehmet EURO account"));
        customer.addAccount(new Account(EAccountType.TL,
                                        10000,
                                        "mehmet TL account"));

        this.customerMap.put(customer.getUsername(), customer);

        customer = new Customer("ali",
                                "1234",
                                "ali",
                                "aya");
        customer.addAccount(new Account(EAccountType.DOLAR,
                                        1000,
                                        "ali EURO account"));
        customer.addAccount(new Account(EAccountType.TL,
                                        10000,
                                        "ali TL account"));

        this.customerMap.put(customer.getUsername(), customer);
    }
}
