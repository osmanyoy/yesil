package com.allianz.spring.boot.customer;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PhoneItem {

    @Id
    @GeneratedValue
    private long     phoneId;
    private String   phoneDesc;
    private String   phone;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    private Customer customer;

    public long getPhoneId() {
        return this.phoneId;
    }

    public void setPhoneId(final long phoneIdParam) {
        this.phoneId = phoneIdParam;
    }


    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phoneParam) {
        this.phone = phoneParam;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }

    public String getPhoneDesc() {
        return this.phoneDesc;
    }

    public void setPhoneDesc(final String phoneDescParam) {
        this.phoneDesc = phoneDescParam;
    }


}
