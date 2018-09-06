package com.yapikredi.training.java;

public class MyFirstClass {

	public static void main(String[] args) {
		
		int iVal = 100;
		int maxVal = Integer.MAX_VALUE;
		int minVal = Integer.MIN_VALUE;
		
		Integer intVal1 = 100;
		Integer intVal2 = new Integer(100);
		
		System.out.println("Max int : " + maxVal);
		System.out.println("Min int : " + minVal);
		
		long lVal = 10_000_000_000L;
		long maxlVal = Long.MAX_VALUE;
		long minlVal = Long.MIN_VALUE;
		
		Long longVal = 100000L;
		longVal = null;
		
		short sValue = 100;
		Short shortValue = 100;
		byte  bvalue = 0x10;
		float fValue = 2.2f;
		double dValue = 2.2;
		
		
		
		String str = "osman";
		String str1 = new String("osman");
		
		System.out.println("Long Max int : " + maxlVal);
		System.out.println("Long Min int : " + minlVal);
		

		Employee emp = new Employee();
		emp.setName("osman"); 
		emp.setSurname("yaycýoðlu");
		emp.setAge(48);
		
		System.out.println("Employee : " + emp);
		
		System.out.println("Employee name : " + emp.getName() + " surname : " + emp.getSurname() + " age : " + emp.getAge());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello World-" + i);
		}
	}

}
