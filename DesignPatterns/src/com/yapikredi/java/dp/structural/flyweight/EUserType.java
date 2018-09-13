package com.yapikredi.java.dp.structural.flyweight;

public enum EUserType {
	USER1(10, 20, "test flyweight 1"), USER2(10, 20, "test flyweight 1"), USER3(10, 20, "test flyweight 1");

	private final int value1;
	private final int value2;
	private final String str1;

	private EUserType(final int value1, final int value2, final String str) {
		this.value1 = value1;
		this.value2 = value2;
		this.str1 = str;
	}

	public int getValue1() {
		return this.value1;
	}

	public int getValue2() {
		return this.value2;
	}

	public String getStr1() {
		return this.str1;
	}

}
