package com.allianz.spring.boot.customer;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerRest {

    @Autowired
    private CustomerManager custormerManager;

    @GetMapping("/hello")
    public String helloworld() {
        return "hello";
    }

    @GetMapping("/add/{isim}")
    public String addCustomer(@PathVariable("isim") final String name,
                              @RequestParam("id") final long id) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setCustomerId(id);
        this.custormerManager.getCustomerMap()
                             .put(id,
                                  customer);
        return "Customer eklendi " + name + " id : " + id;
    }

    @GetMapping("/all")
    public Collection<Customer> getAllCustomers() {
        Map<Long, Customer> customerMapLoc = this.custormerManager.getCustomerMap();
        return customerMapLoc.values();
    }


}
