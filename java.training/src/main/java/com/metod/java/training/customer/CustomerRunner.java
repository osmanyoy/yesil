package com.metod.java.training.customer;

public class CustomerRunner {
    public static void main(final String[] args) {
        CustomerRunner customerRunner = new CustomerRunner();
        customerRunner.testFinally(8);
        customerRunner.testFinally(10);
        try {
            CustomerStore buildCustomerStore1Type = CustomerStore.getBuilder()
                                                                 .withCustomer1MaxCount(5)
                                                                 .withCustomer2MaxCount(5)
                                                                 .withCustomer3MaxCount(21)
                                                                 .buildCustomerStore1Type();
            System.out.println("Created");
        } catch (CustomerStoreCreateException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public String testFinally(final int a) {
        try {
            if (a == 10) {
                throw new CustomerStoreCreateException("10 geldi");
            }
            return "OK";
        } catch (Exception e) {
            System.out.println("exception : " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
        return "ERROR";
    }
}
