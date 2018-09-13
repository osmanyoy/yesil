package com.yapikredi.java.dp.structural.facade;

import com.yapikredi.java.dp.structural.adapter.Customer;

public class Facade {
	public static void main(final String[] args) {
		UserCreateFacade createFacade = new UserCreateFacade();
		Customer customer = new Customer("osman", "yaya", 48);
		createFacade.create(customer);
	}
}
