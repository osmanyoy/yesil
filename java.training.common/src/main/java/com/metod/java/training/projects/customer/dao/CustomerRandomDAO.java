package com.metod.java.training.projects.customer.dao;

import java.util.ArrayList;
import java.util.List;

public class CustomerRandomDAO implements ICustomerDAO {

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer("osman",
                                         "1234",
                                         "osman",
                                         "aya");
        customer.setCustomerType(ECustomerType.PLATINIUM);
        customer.addAccount(new Account(EAccountType.DOLAR,
                                        1000,
                                        "osman DOLAR account"));
        customer.addAccount(new Account(EAccountType.EURO,
                                        1000,
                                        "osman EURO account"));
        customer.addAccount(new Account(EAccountType.TL,
                                        10000,
                                        "osman TL account"));
        customers.add(customer);

        customer = new Customer("mehmet",
                                "1234",
                                "mehmet",
                                "aya");
        customer.setCustomerType(ECustomerType.GOLD);
        customer.addAccount(new Account(EAccountType.EURO,
                                        1000,
                                        "mehmet EURO account"));
        customer.addAccount(new Account(EAccountType.TL,
                                        10000,
                                        "mehmet TL account"));

        customers.add(customer);

        customer = new Customer("ali",
                                "1234",
                                "ali",
                                "aya");
        customer.setCustomerType(ECustomerType.SILVER);
        customer.addAccount(new Account(EAccountType.TL,
                                        10000,
                                        "ali TL account"));

        customers.add(customer);
        return customers;
    }

    @Override
    public void addCustomer(final Customer customer) {

    }

}
