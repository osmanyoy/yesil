package com.yapikredi.training.project.customer;

import java.util.HashMap;
import java.util.Map;

import com.yapikredi.training.java.Customer;

public class CustomerManager {
	private Map<String, Customer> customerCache = new HashMap<>();
	
	public CustomerManager() {
		GumusCustomer gumusCustomer =  new GumusCustomer("osman", "yayciouglu", 48, "osman", "1234");
		gumusCustomer.setAccountAmount(EAccountType.TL, 1000, "Osman TL account");
		customerCache.put("osman", gumusCustomer);
		
		AltinCustomer altinCustomer =  new AltinCustomer("mehmet", "yayciouglu", 48, "mehmet", "1234");
		altinCustomer.setAccountAmount(EAccountType.TL, 2000, "Mehmet TL account");
		altinCustomer.setAccountAmount(EAccountType.DOLAR, 1000, "Mehmet DOLAR account");
		customerCache.put("mehmet", altinCustomer);

		PlatinyumCustomer platCustomer =  new PlatinyumCustomer("ali", "yayciouglu", 48, "ali", "1234");
		platCustomer.setAccountAmount(EAccountType.TL, 2000, "Ali TL account");
		platCustomer.setAccountAmount(EAccountType.DOLAR, 1000, "Ali DOLAR account");
		platCustomer.setAccountAmount(EAccountType.EURO, 1500, "Ali EURO account");
		customerCache.put("ali", platCustomer);

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
