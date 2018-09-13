package com.yapikredi.java.dp.structural.adapter;

public class EmployeeAdapter extends Person {
	private Employee employee;

	public EmployeeAdapter(final Employee employee) {
		this.employee = employee;

	}

	@Override
	public String getName() {
		return this.employee.getIsim();
	}

	@Override
	public String getSurname() {
		return this.employee.getSoyisim();
	}

	@Override
	public int getAge() {
		return this.employee.getYas();
	}
}
