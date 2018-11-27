package com.training.dp.creation.general;


public class Runner {

    public static void main(final String[] args) {
        Printer printerLoc = new Printer();
        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yaycioglu");

        printerLoc.print(customerLoc);

        Person personLoc = new Person();
        personLoc.setIsim("osman");
        personLoc.setSoyisim("test");

        PersonAdapt adaptLoc = new PersonAdapt(personLoc);

        printerLoc.print(adaptLoc);


        int index = 3;

        Customer createCustomerLoc = CustomerFactory.createCustomer(index);

        printerLoc.print(createCustomerLoc);


    }
}
