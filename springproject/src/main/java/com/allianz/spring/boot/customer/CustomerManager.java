package com.allianz.spring.boot.customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.allianz.spring.boot.MyNewClass;

// @Component
public class CustomerManager {

    private final Map<Long, Customer> customerMap = new HashMap<>();

    @Autowired
    @Qualifier("DB")
    private ICustomerDAO              customerDAO;

    // @Autowired
    private MyNewClass                myNewClass;

    //    @Value("${customer.manager.name}")
    private String                    name;

    //
    //    public CustomerManager(@Value("${customer.manager.name}") final String nameParam) {
    //        this.name = nameParam;
    //    }


    public CustomerManager() {
        System.out.println("CustomerManager constructor ");
    }

    public String getName() {
        return this.name;
    }

    //    @Autowired
    //    public CustomerManager(final MyNewClass myNewClassParam) {
    //        super();
    //        this.myNewClass = myNewClassParam;
    //    }

    //    @Value("${customer.manager.name}")
    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public MyNewClass getMyNewClass() {
        return this.myNewClass;
    }

    // @Autowired
    public void setMyNewClass(final MyNewClass myNewClassParam) {
        this.myNewClass = myNewClassParam;
    }

    @Autowired
    public void setAll(final MyNewClass myNewClassParam,
                       @Value("${customer.manager.name}") final String nameParam) {
        this.myNewClass = myNewClassParam;
        this.name = nameParam;
    }


    @Autowired
    public void fillCustomerMap() {
        List<Customer> allCustomersLoc = this.customerDAO.getAllCustomers();
        for (Customer customerLoc : allCustomersLoc) {
            this.customerMap.put(customerLoc.getCustomerId(),
                                 customerLoc);
        }
    }

    public void addCustomer(final Customer customerParam) {
        this.customerDAO.saveCustomer(customerParam);
        this.customerMap.put(customerParam.getCustomerId(),
                             customerParam);
    }

    public void deleteCustomer(final long custId) {
        this.customerDAO.deleteCustomer(custId);
        this.customerMap.remove(custId);
    }

    public Collection<Customer> getAllCustomers() {
        return this.customerMap.values();
    }

}
