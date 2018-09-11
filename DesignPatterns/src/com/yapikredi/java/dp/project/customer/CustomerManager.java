package com.yapikredi.java.dp.project.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yapikredi.java.dp.project.customer.dao.CustomerDAOFactory;
import com.yapikredi.java.dp.project.customer.dao.ICustomerDAO;

public class CustomerManager {
	private static volatile CustomerManager instance;
	private Map<String, Customer> customerCache = new HashMap<>();

	private CustomerManager() {
	}

	public static CustomerManager getInstance() {

		if (CustomerManager.instance == null) {
			synchronized (CustomerManager.class) {
				if (CustomerManager.instance == null) {
					CustomerManager.instance = new CustomerManager();
					CustomerManager.instance.init();
				}
			}
		}
		return CustomerManager.instance;
	}

	private void init() {
		ICustomerDAO createCustomerDAO = CustomerDAOFactory.createCustomerDAO();
		List<Customer> allCustomers = createCustomerDAO.getAllCustomers();
		for (Customer customer : allCustomers) {
			this.customerCache.put(customer.getUsername(),
			                       customer);
		}
	}

	public Customer login(final String username, final String password) throws LoginException {
		Customer customer = this.customerCache.get(username);
		if (customer == null) {
			throw new LoginException("Böyle bir user yok");
		}
		if (!password.equals(customer.getPassword())) {
			throw new LoginException("Password yanlýþ");
		}
		return customer;
	}

}
