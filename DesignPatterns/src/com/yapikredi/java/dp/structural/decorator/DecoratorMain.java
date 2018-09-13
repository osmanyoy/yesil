package com.yapikredi.java.dp.structural.decorator;

import com.yapikredi.java.dp.structural.adapter.BusCardPrinter;
import com.yapikredi.java.dp.structural.adapter.Person;

public class DecoratorMain {
	public static void main(final String[] args) {
		Person person = new PersonNameDecorator1(new PersonNameDecorator2(new Person("osman", "yay", 58)));
		BusCardPrinter busCardPrinter = new BusCardPrinter();
		busCardPrinter.print(person);
	}
}
