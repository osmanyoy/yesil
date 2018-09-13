package com.yapikredi.java.dp.structural.adapter;

public class AppMain {
	public static void main(final String[] args) {
		Person person = new Person("osman", "yayc", 48);
		BusCardPrinter busCardPrinter = new BusCardPrinter();
		busCardPrinter.print(person);

		Customer customer = new Customer("memet", "snaa", 35);
		CustomerAdapter customerAdapter = new CustomerAdapter(customer);
		busCardPrinter.print(customerAdapter);

		Employee employee = new Employee("Ali", "veli", 49);
		EmployeeAdapter employeeAdapter = new EmployeeAdapter(employee);
		busCardPrinter.print(employeeAdapter);

	}
}
