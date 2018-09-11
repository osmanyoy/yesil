package com.yapikredi.java.dp.project.customer;

import java.util.EnumMap;

public class Customer {
	private String name;
	private String surname;
	private String username;
	private String password;
	private int age;
	private ECustomerType customerType;
	private EnumMap<EAccountType, Account> accounts = new EnumMap<>(EAccountType.class);

	private Customer() {
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public int getAge() {
		return this.age;
	}

	public ECustomerType getCustomerType() {
		return this.customerType;
	}

	public static CustomerBuilder getBuilder() {
		return new CustomerBuilder();
	}

	public static class CustomerBuilder {
		private Customer customer = new Customer();

		private CustomerBuilder() {
		}

		public CustomerBuilder setName(final String name) {
			this.customer.name = name;
			return this;
		}

		public CustomerBuilder setSurname(final String surname) {
			this.customer.surname = surname;
			return this;
		}

		public CustomerBuilder setUsername(final String username) {
			this.customer.username = username;
			return this;
		}

		public CustomerBuilder setPassword(final String password) {
			this.customer.password = password;
			return this;
		}

		public CustomerBuilder setAge(final int age) {
			this.customer.age = age;
			return this;
		}

		public CustomerBuilder setCustomerType(final ECustomerType customerType) {
			this.customer.customerType = customerType;
			return this;
		}

		public CustomerBuilder addAccount(final Account account) {
			this.customer.accounts.put(account.getAccountType(),
			                           account);
			return this;
		}

		public Customer build() {
			// Validation ...
			return this.customer;
		}

	}

	public Account getAccount(final EAccountType type) {
		return this.accounts.get(type);
	}

}
