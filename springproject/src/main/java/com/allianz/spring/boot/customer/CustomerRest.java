package com.allianz.spring.boot.customer;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String addCustomer(@PathVariable("isim") final String name) {
        Customer customer = new Customer();
        customer.setName(name);
        this.custormerManager.addCustomer(customer);
        return "Customer eklendi " + name;
    }

    @GetMapping("/all")
    public Collection<Customer> getAllCustomers() {
        return this.custormerManager.getAllCustomers();
    }

    @GetMapping("/remove/{id}")
    public String removeCustomer(@PathVariable("id") final long custId) {
        this.custormerManager.deleteCustomer(custId);
        return "Customer eklendi " + custId;
    }

    @PostMapping("/add")
    public String addCustomer(@RequestBody final Customer customerParam) {
        List<PhoneItem> phoneItemsLoc = customerParam.getPhoneItems();
        for (PhoneItem phoneItemLoc : phoneItemsLoc) {
            phoneItemLoc.setCustomer(customerParam);
        }

        this.custormerManager.addCustomer(customerParam);
        return "OK";
    }

}
