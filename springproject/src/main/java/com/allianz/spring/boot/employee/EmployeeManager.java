package com.allianz.spring.boot.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeManager {

    private final Map<Long, Employee> employeeCache = new HashMap<>();

    @Autowired
    private IEmployeeDAO              employeeDAO;

    public void addEmployee(final Employee employee) {
        this.employeeCache.put(employee.getEmployeeId(),
                               employee);
        this.employeeDAO.persistEmployee(employee);

    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> valuesLoc = this.employeeCache.values();
        List<Employee> empList = new ArrayList<>(valuesLoc);
        return empList;
    }

    public void removeEmployee(final long id) {
        this.employeeDAO.removeEmployee(id);

    }

    @Autowired
    public void fillCache() {
        Collection<Employee> allEmployeeLoc = this.employeeDAO.getAllEmployee();
        for (Employee employeeLoc : allEmployeeLoc) {
            this.employeeCache.put(employeeLoc.getEmployeeId(),
                                   employeeLoc);
        }
    }

}
