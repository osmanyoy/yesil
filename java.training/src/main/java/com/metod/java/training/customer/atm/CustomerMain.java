package com.metod.java.training.customer.atm;

import java.util.Scanner;

public class CustomerMain {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerFactory.writeCustomerTypeMenu();
        int index = scanner.nextInt();
        try {
            CustomerFactory.createCustomer(index);
        } catch (AtmException e) {
            System.out.println("Yanlýþ seçim  : " + e.getMessage());
            return;
        }
        try {
            ICustomer createCustomer = CustomerFactory.createCustomer(index);
            while (true) {
                try {
                    createCustomer.writeAmountToConsole();
                    System.out.println("-------------------");
                    createCustomer.writeMenuToConsole();
                    int cIndex = scanner.nextInt();
                    System.out.println("Amount : ");
                    int amount = scanner.nextInt();
                    createCustomer.executeMenuCommand(cIndex, amount);
                } catch (Exception e) {
                    System.out.println("Error oluþtu yeniden deneyelim.");
                }
            }
        } catch (AtmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
