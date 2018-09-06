package com.yapikredi.training.java;

public class Employee {
	
	private String name = "john";
	private String surname= "doe";
	private int age = 30;
	private boolean test = false;
	

	public Employee() {
		
	}
	
	public Employee(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}


	public Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", age=" + age + ", test=" + test + "]";
	}

	public String calculateSalary(int multiplier) {
		int salary = age * multiplier * 1_000;
		return "Salary : " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			return;
		}
		if (name.length() > 20) {
			return;
		}
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}
	
	
}
