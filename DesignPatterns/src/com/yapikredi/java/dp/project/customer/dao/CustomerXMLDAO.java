package com.yapikredi.java.dp.project.customer.dao;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.java.dp.project.customer.Customer;
import com.yapikredi.java.dp.project.customer.ECustomerType;

public class CustomerXMLDAO implements ICustomerDAO {

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
		                      .build());
		customers.add(Customer.getBuilder()
		                      .setName("mehmet")
		                      .setSurname("yay")
		                      .setAge(48)
		                      .setUsername("mehmet")
		                      .setPassword("1234")
		                      .setCustomerType(ECustomerType.GOLD)
		                      .build());

		customers.add(Customer.getBuilder()
		                      .setName("ali")
		                      .setSurname("yay")
		                      .setAge(48)
		                      .setUsername("ali")
		                      .setPassword("1234")
		                      .setCustomerType(ECustomerType.PLANTINIUM)
		                      .build());

		return customers;
	}

}
