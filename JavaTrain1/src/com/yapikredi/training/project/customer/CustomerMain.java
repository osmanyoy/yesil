package com.yapikredi.training.project.customer;

import java.util.Scanner;

import com.yapikredi.training.java.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Username : ");
		String username = scanner.nextLine();
		System.out.println("Password : ");
		String password = scanner.nextLine();
		Customer loggedCustomer = customerManager.login(username, password);
		if (loggedCustomer == null) {
			System.out.println("Username yada Password yanlýþ.");
		} else {
			System.out.println(loggedCustomer);
		}
		
	}
}
