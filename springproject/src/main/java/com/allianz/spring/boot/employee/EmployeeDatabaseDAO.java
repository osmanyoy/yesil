package com.allianz.spring.boot.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDatabaseDAO implements IEmployeeDAO {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Collection<Employee> getAllEmployee() {
        List<Employee> employeesLoc = new ArrayList<>();
        Iterable<Employee> findAllLoc = this.employeeRepository.findAll();
        for (Employee employeeLoc : findAllLoc) {
            employeesLoc.add(employeeLoc);
        }
        return employeesLoc;
    }

    @Override
    public void persistEmployee(final Employee employeeParam) {
        this.employeeRepository.save(employeeParam);

    }

    @Override
    public void removeEmployee(final long empIdParam) {
        this.employeeRepository.deleteById(empIdParam);

    }


}
