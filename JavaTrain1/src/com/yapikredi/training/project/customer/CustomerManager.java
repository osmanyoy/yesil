package com.yapikredi.training.project.customer;

import java.util.HashMap;
import java.util.Map;

import com.yapikredi.training.java.Customer;

public class CustomerManager {
	private Map<String, Customer> customerCache = new HashMap<>();
	
	public CustomerManager() {
		customerCache.put("osman", new Customer("osman", "yayciouglu", 10_000, 48, "osman", "1234"));
		customerCache.put("osman1", new Customer("osman1", "yayciouglu", 1000, 30, "osman1", "1234"));
		customerCache.put("osman2", new Customer("osman2", "yayciouglu", 10000, 31, "osman2", "1234"));
		customerCache.put("osman3", new Customer("osman3", "yayciouglu", 10000, 32, "osman3", "1234"));
	}
	
	public Customer login(String username,String password) {
		Customer customer = customerCache.get(username);
		if (customer == null) {
			return null;
		}
		if (password.equals(customer.getPassword())) {
			return customer;
		}
		return null;
	}
}
