package com.allianz.spring.boot.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long   employeeId;
    @NotEmpty
    private String name;
    private String surname;
    private int    age;

    public long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(final long employeeIdParam) {
        this.employeeId = employeeIdParam;
    }

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

    public int getAge() {
        return this.age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }


}
