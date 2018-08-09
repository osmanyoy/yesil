package com.allianz.spring.boot.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.allianz.spring.boot.MyNewClass;

// @Component
public class CustomerManager {

    private final Map<Long, Customer> customerMap = new HashMap<>();

    @Autowired
    private ICustomerDAO              customerPropertyReaderDAO;

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
        List<Customer> allCustomersLoc = this.customerPropertyReaderDAO.getAllCustomers();
        for (Customer customerLoc : allCustomersLoc) {
            this.getCustomerMap()
                .put(customerLoc.getCustomerId(),
                     customerLoc);
        }

    }

    public Map<Long, Customer> getCustomerMap() {
        return this.customerMap;
    }

}
