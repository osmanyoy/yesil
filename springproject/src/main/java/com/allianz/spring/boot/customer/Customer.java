package com.allianz.spring.boot.customer;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long            customerId;
    private String          name;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Address         address;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
    private List<PhoneItem> phoneItems;


    public Address getAddress() {
        return this.address;
    }


    public void setAddress(final Address addressParam) {
        this.address = addressParam;
    }


    public List<PhoneItem> getPhoneItems() {
        return this.phoneItems;
    }


    public void setPhoneItems(final List<PhoneItem> phoneItemsParam) {
        this.phoneItems = phoneItemsParam;
    }

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
