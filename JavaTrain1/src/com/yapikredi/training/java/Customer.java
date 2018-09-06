package com.yapikredi.training.java;

import com.yapikredi.training.collentions.StringUtils;

public class Customer {
	private String name;
	private String surname;
	private double tlAmount;
	private int age;
	private String username;
	private String password;

	public Customer(String name, String surname, double tlAmount) {
		super();
		this.name = name;
		this.surname = surname;
		this.tlAmount = tlAmount;
	}

	public Customer(String name, String surname, double tlAmount, int age, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.tlAmount = tlAmount;
		this.age = age;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", tlAmount=" + tlAmount + ", age="
				+ StringUtils.addDigits(age, 3) + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getTlAmount() {
		return tlAmount;
	}

	public void setTlAmount(double tlAmount) {
		this.tlAmount = tlAmount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
