package com.allianz.spring.boot.customer;

import java.util.List;

public interface ICustomerDAO {

    List<Customer> getAllCustomers();

    void saveCustomer(Customer customer);

    void deleteCustomer(long customerId);

}
