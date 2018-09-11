package com.yapikredi.java.dp.project.customer.dao;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.java.dp.project.customer.Account;
import com.yapikredi.java.dp.project.customer.Customer;
import com.yapikredi.java.dp.project.customer.EAccountType;
import com.yapikredi.java.dp.project.customer.ECustomerType;

public class CustomerManualDAO implements ICustomerDAO {

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customers.add(Customer.getBuilder()
		                      .setName("osman")
		                      .setSurname("yay")
		                      .setAge(48)
		                      .setUsername("osman")
		                      .setPassword("1234")
		                      .setCustomerType(ECustomerType.SILVER)
		                      .addAccount(new Account("Osman TL", 1000, EAccountType.TL))
		                      .build());
		customers.add(Customer.getBuilder()
		                      .setName("mehmet")
		                      .setSurname("yay")
		                      .setAge(48)
		                      .setUsername("mehmet")
		                      .setPassword("1234")
		                      .setCustomerType(ECustomerType.GOLD)
		                      .addAccount(new Account("Mehmet TL", 1000, EAccountType.TL))
		                      .addAccount(new Account("Mehmet DOLAR", 2000, EAccountType.DOLAR))
		                      .build());

		customers.add(Customer.getBuilder()
		                      .setName("ali")
		                      .setSurname("yay")
		                      .setAge(48)
		                      .setUsername("ali")
		                      .setPassword("1234")
		                      .addAccount(new Account("Ali TL", 1000, EAccountType.TL))
		                      .addAccount(new Account("Ali DOLAR", 2000, EAccountType.DOLAR))
		                      .addAccount(new Account("Ali EURO", 2500, EAccountType.EURO))
		                      .setCustomerType(ECustomerType.PLANTINIUM)
		                      .build());

		return customers;
	}

}
