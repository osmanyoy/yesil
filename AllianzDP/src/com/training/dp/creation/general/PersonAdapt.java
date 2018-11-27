package com.training.dp.creation.general;


public class PersonAdapt extends Customer {

    private final Person person;

    public PersonAdapt(final Person person) {
        this.person = person;

    }

    @Override
    public String getName() {
        return this.person.getIsim();
    }


    @Override
    public String getSurname() {

        return this.person.getSoyisim();
    }
}
