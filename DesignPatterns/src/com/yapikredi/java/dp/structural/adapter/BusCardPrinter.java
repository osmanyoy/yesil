package com.yapikredi.java.dp.structural.adapter;

public class BusCardPrinter {

	public void print(final Person person) {
		System.out.println("Card \nName : " + person.getName() + "\nSurname : " + person.getSurname() + "\nAge : "
		        + person.getAge());
	}
}
