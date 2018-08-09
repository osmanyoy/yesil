package com.allianz.spring.boot.employee;


public class Employee {

    private long   employeeId;
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
