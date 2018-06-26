package com.allianz.spring.boot.jpa;

import org.springframework.data.repository.CrudRepository;

import com.allianz.spring.boot.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
