package com.metod.java.training.projects.customer;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerList {
    private List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return this.customers;
    }

    public void setCustomers(final List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomerList [customers=" + this.customers + "]";
    }

}
