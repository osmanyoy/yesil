package com.yapikredi.java.dp.structural.adapter;

public class CustomerAdapter extends Person {
	private Customer customer;

	public CustomerAdapter(final Customer customer) {
		this.customer = customer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return this.customer.getFirtName();
	}

	@Override
	public String getSurname() {
		return this.customer.getLastName();
	}

	@Override
	public int getAge() {

		return this.customer.getAge();
	}

}
