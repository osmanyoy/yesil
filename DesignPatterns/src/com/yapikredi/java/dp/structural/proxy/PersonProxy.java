package com.yapikredi.java.dp.structural.proxy;

import com.yapikredi.java.dp.structural.adapter.Person;

public class PersonProxy extends Person {

	private Person person;

	public PersonProxy(final Person person) {
		this.person = person;
	}

	@Override
	public String getName() {
		System.out.println("getName çaðrýldý");
		return this.person.getName();
	}

	@Override
	public String getSurname() {
		System.out.println("getSurname çaðrýldý");
		return this.person.getSurname();
	}

	@Override
	public int getAge() {
		System.out.println("getAge çaðrýldý");
		return this.person.getAge();
	}

}
