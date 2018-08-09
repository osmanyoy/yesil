package com.allianz.spring.boot.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerPropertyReaderDAO implements ICustomerDAO {

    @Autowired
    private CustomerProperties cp;

    @Override
    public List<Customer> getAllCustomers() {
        return this.cp.getCustomerList();
    }

    @Override
    public void saveCustomer(final Customer customerParam) {
    }

    @Override
    public void deleteCustomer(final long customerIdParam) {
    }

}
