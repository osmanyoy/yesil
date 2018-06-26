package com.allianz.spring.boot;

import org.springframework.stereotype.Service;

@Service
public class CustomerProcessor {

    public String process(final Customer customerParam) {
        return customerParam.getName() + " " + customerParam.getSurname() + " " + customerParam.getAge();
    }

    public Customer processCustomer(final Customer customerParam) {
        customerParam.setName(customerParam.getName() + " rest");
        return customerParam;
    }

}
