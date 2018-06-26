package com.allianz.spring.boot;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long          empId;
    private String        name;
    private String        surname;
    private String        username;
    private String        password;

    @Enumerated(EnumType.STRING)
    private EEmployeeType employeeType;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String usernameParam) {
        this.username = usernameParam;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String passwordParam) {
        this.password = passwordParam;
    }

    public EEmployeeType getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(final EEmployeeType employeeTypeParam) {
        this.employeeType = employeeTypeParam;
    }

    public Long getEmpId() {
        return this.empId;
    }

    public void setEmpId(final Long empIdParam) {
        this.empId = empIdParam;
    }


}
