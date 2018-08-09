package com.allianz.spring.boot.customer;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("customer")
public class CustomerProperties {

    private List<Customer> customerList;


    public List<Customer> getCustomerList() {
        return this.customerList;
    }


    public void setCustomerList(final List<Customer> customerListParam) {
        this.customerList = customerListParam;
    }


}
