package com.allianz.spring.boot.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.allianz.spring.boot.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findByNameStartingWith(String name);

    List<Customer> findByNameAndSurname(String name,
                                        String surname);

    @Query("select c from Customer c where name = :isim")
    List<Customer> testMethod(@Param("isim") String name);

    @Query(value = "SELECT * FROM CUSTOMER WHERE NAME = :isim", nativeQuery = true)
    List<Customer> testNativeMethod(@Param("isim") String name);


}
