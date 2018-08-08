package com.allianz.spring.boot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

// @Component
public class CustomerManager {

    private final Map<Long, Customer> customerMap = new HashMap<>();

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
        Customer customer1 = new Customer();
        customer1.setCustomerId(1);
        customer1.setName("osman1");

        this.getCustomerMap().put(customer1.getCustomerId(),
                             customer1);

        Customer customer2 = new Customer();
        customer2.setCustomerId(1);
        customer2.setName("osman1");

        this.getCustomerMap().put(customer2.getCustomerId(),
                             customer2);

    }

    public Map<Long, Customer> getCustomerMap() {
        return customerMap;
    }

}
