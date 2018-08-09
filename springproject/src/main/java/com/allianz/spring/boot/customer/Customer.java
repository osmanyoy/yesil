package com.allianz.spring.boot.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long   customerId;
    private String name;

    public long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final long customerIdParam) {
        this.customerId = customerIdParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


}
