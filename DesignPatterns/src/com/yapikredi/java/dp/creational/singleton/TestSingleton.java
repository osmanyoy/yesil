package com.yapikredi.java.dp.creational.singleton;

public class TestSingleton {
	private static volatile TestSingleton instance;

	private TestSingleton() {
	}

	public static TestSingleton getInstance() {

		if (TestSingleton.instance == null) {
			synchronized (TestSingleton.class) {
				if (TestSingleton.instance == null) {
					TestSingleton.instance = new TestSingleton();
				}
			}
		}
		return TestSingleton.instance;
	}
}
