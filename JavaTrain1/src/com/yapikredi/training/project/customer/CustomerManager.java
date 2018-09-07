package com.yapikredi.training.project.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yapikredi.training.java.Customer;

public class CustomerManager {
	private Map<String, Customer> customerCache = new HashMap<>();
	
	public CustomerManager() {
		CustomerDAO customerDAO = new CustomerDAO();
		List<Customer> allCustomers = customerDAO.getAllCustomers();
		if (allCustomers != null) {
			for (Customer customer : allCustomers) {
				switch (customer.getCustomerType()) {
				case ALTIN:
					AltinCustomer altinCustomer = new AltinCustomer(customer.getName(), customer.getSurname(), customer.getAge(), customer.getUsername(), customer.getPassword());
					altinCustomer.setAccounts(customer.getAccounts());
					customerCache.put(altinCustomer.getUsername(), altinCustomer);
					break;
				case GUMUS:
					GumusCustomer gumusCustomer = new GumusCustomer(customer.getName(), customer.getSurname(), customer.getAge(), customer.getUsername(), customer.getPassword());
					gumusCustomer.setAccounts(customer.getAccounts());
					customerCache.put(gumusCustomer.getUsername(), gumusCustomer);
					break;
				case PLATINIUM:
					PlatinyumCustomer platCustomer = new PlatinyumCustomer(customer.getName(), customer.getSurname(), customer.getAge(), customer.getUsername(), customer.getPassword());
					platCustomer.setAccounts(customer.getAccounts());
					customerCache.put(platCustomer.getUsername(), platCustomer);
					break;
				default:
					break;
				}
			}
		}
	}
	
	public Customer login(String username,String password) throws LoginException {
		Customer customer = customerCache.get(username);
		if (customer == null) {
			throw new LoginException("Böyle bir user yok");
		}
		if (password.equals(customer.getPassword())) {
			return customer;
		}
		throw new LoginException("Password uyuþmuyor");
	}
}
