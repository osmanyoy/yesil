package com.allianz.spring.boot.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public EmployeeManager employeeManager() {
        return new EmployeeManager();
    }

    @Bean
    public EmployeeDatabaseDAO employeeDatabaseDAO() {
        return new EmployeeDatabaseDAO();
    }

}
