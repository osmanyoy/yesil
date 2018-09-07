package com.yapikredi.training.project.customer;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.yapikredi.training.java.Customer;

@XmlRootElement
public class CustomerList {
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
}
