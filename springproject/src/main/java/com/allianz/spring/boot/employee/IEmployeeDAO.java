package com.allianz.spring.boot.employee;

import java.util.Collection;

public interface IEmployeeDAO {

    public Collection<Employee> getAllEmployee();

    public void persistEmployee(Employee employeeParam);

    public void removeEmployee(long empId);
}
