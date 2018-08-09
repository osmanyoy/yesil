package com.allianz.spring.boot.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {

    private final Map<Long, Employee> employeeCache = new HashMap<>();

    public void addEmployee(final Employee employee) {
        this.employeeCache.put(employee.getEmployeeId(),
                               employee);

    }

    public List<Employee> getAllEmployees() {
        Collection<Employee> valuesLoc = this.employeeCache.values();
        List<Employee> empList = new ArrayList<>(valuesLoc);
        return empList;
    }

    public void removeEmployee(final long id) {
        this.employeeCache.remove(id);

    }

}
