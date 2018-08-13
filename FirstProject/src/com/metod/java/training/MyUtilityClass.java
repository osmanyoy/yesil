package com.metod.java.training;

public class MyUtilityClass {

	static {
		for (int i = 0; i < 10; i++) {
			System.out.println("test : " + i);
		}
	}

	public static int add(final int value1, final int value2) {
		return value1 + value2;
	}

}
