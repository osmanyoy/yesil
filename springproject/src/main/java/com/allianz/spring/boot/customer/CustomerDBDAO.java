package com.allianz.spring.boot.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDBDAO implements ICustomerDAO {

    @Autowired
    private ICustomerRepo custRepo;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customersLoc = new ArrayList<>();
        Iterable<Customer> findAllLoc = this.custRepo.findAll();
        for (Customer customerLoc : findAllLoc) {
            customersLoc.add(customerLoc);
        }
        return customersLoc;
    }

    @Override
    public void saveCustomer(final Customer customerParam) {
        this.custRepo.save(customerParam);
    }

    @Override
    public void deleteCustomer(final long customerIdParam) {
        this.custRepo.deleteById(customerIdParam);
    }

}
