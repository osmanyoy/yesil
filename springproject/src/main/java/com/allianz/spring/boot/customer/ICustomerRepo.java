package com.allianz.spring.boot.customer;

import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepo extends CrudRepository<Customer, Long> {

}
