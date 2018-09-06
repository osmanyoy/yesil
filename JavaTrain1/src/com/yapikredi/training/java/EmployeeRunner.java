package com.yapikredi.training.java;

import java.util.Scanner;

import com.yapikredi.training.other.OtherClass;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee("osman", "yaycioglu", 48);
		
		OtherClass oc = new OtherClass();

		int multiplier = scanner.nextInt();
		
		oc.setMultiplier(multiplier);
		
		String calculateSalary = employee.calculateSalary(oc.getMultiplier());
		
		employee.setName("9032459043u");
		System.out.println("Employee :" + employee.getName() +  calculateSalary);
		
	}
	
}
