package com.metod.java.training.projects.customer;

import java.util.Scanner;

public class CustomerMain {
    public static void main(final String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.fillRandomCustomers();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username : ");
            String user = scanner.nextLine();
            System.out.println("password : ");
            String pass = scanner.nextLine();

            Customer customer = customerManager.getCustomer(user);
            if (customer != null) {
                String password = customer.getPassword();
                if (pass.equals(password)) {
                    System.out.println(customer);
                } else {
                    System.out.println("Username yada Password yanlýþ");
                }
            } else {
                System.out.println("Username yada Password yanlýþ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
