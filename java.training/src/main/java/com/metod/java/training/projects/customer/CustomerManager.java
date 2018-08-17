package com.metod.java.training.projects.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.metod.java.training.projects.customer.dao.Customer;
import com.metod.java.training.projects.customer.dao.CustomerDAOFactory;
import com.metod.java.training.projects.customer.dao.ICustomerDAO;

public class CustomerManager {

    private Map<String, Customer> customerMap = new HashMap<>();

    public CustomerManager() {
        ICustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
        List<Customer> allCustomers = customerDAO.getAllCustomers();
        if (allCustomers != null) {
            for (Customer customer : allCustomers) {
                this.addCustomer(customer);
            }
        }
    }

    public void addCustomer(final Customer customer) {
        this.customerMap.put(customer.getUsername(), customer);
    }

    public Customer getCustomer(final String username) {
        return this.customerMap.get(username);
    }

}
