package com.training.dp.creation.general;


public class Customer {

    private String surname;
    private String name;


    public Customer(final String surnameParam,
                    final String nameParam) {
        super();
        this.surname = surnameParam;
        this.name = nameParam;
    }


    public Customer() {
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


}
