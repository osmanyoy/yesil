package com.yapikredi.training.exceptions;

public class MyClass {
	
	public String helloWorld(int value) throws MyException {
		if (value == 9) {
			throw new IllegalStateException("9 gelemez");
		}
		if (value == 10) {
			throw new MyException("10 geldi","10 gelmemeliydi","Ama geldi");
		}
		return "Hello world " + value;
	}
}
