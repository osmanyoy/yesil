package com.yapikredi.java.dp.structural.adapter;

public class Person {
	private String name;
	private String surname;
	private int age;

	public Person() {
	}

	public Person(final String name, final String surname, final int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

}
