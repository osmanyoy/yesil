package com.yapikredi.java.dp.creational.builder;

public class ImmutableObj {
	private String name;
	private String surname;
	private String phone;
	private int age;
	
	public ImmutableObj(String name, String surname, String phone, int age) throws Exception {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.age = age;
	}
	
	public ImmutableObj(String name, String surname, int age) throws Exception {
		
	}

	public ImmutableObj(String name, int age) throws Exception {
		
	}

	public ImmutableObj(String name) throws Exception {
		
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPhone() {
		return phone;
	}
	public int getAge() {
		return age;
	}
}
