package com.allianz.spring.boot.employee;

import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {

}
