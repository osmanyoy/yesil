package com.allianz.spring.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//kullanma
@Scope("prototype")
@Component
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long   custId;

    @NotEmpty
    @Size(min = 3, max = 30, message = "3 ila 30 arasında olmalı")
    private String name;

    @NotEmpty
    @Size(min = 3, max = 30)
    private String surname;

    @Max(150)
    @Min(18)
    private int    age;

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
