package com.yapikredi.java.dp.structural.adapter;

public class Customer {
	private String firtName;
	private String lastName;
	private int age;

	public Customer(final String firtName, final String lastName, final int age) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirtName() {
		return this.firtName;
	}

	public void setFirtName(final String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

}
