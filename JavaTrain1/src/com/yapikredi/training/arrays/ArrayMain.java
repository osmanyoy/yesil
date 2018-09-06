package com.yapikredi.training.arrays;

import com.yapikredi.training.java.Employee;

public class ArrayMain {
	
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[10];
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("test employee" + i, "surname", 30+i);
		}
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		
		Employee[] newEmployees = new Employee[20];
		
		for (int i = 0; i < employees.length; i++) {
			newEmployees[i] = employees[i];
		}
		
		System.arraycopy(employees, 0, newEmployees, 0, 10);
		
		int[] intVals = new int[10];
		
		for (int i = 0; i < intVals.length; i++) {
			System.out.println(intVals[i]);
		}
	}
	
}
