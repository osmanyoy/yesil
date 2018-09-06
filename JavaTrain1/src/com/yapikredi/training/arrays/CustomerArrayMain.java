package com.yapikredi.training.arrays;

import com.yapikredi.training.java.Customer;

public class CustomerArrayMain {
	public static void main(String[] args) {
		Customer[] customers = new Customer[10];
		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer("Customer" + i, "Surname" + i, i*1_000);
		}
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]);
		}
	}
}
