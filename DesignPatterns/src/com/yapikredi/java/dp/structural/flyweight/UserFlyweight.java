package com.yapikredi.java.dp.structural.flyweight;

public class UserFlyweight {
	private EUserType userType;
	private int value1;
	private int value2;
	private String str1;

	public EUserType getUserType() {
		return this.userType;
	}

	public void setUserType(final EUserType userType) {
		this.userType = userType;
	}

	public int getValue1() {
		return this.value1;
	}

	public void setValue1(final int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return this.value2;
	}

	public void setValue2(final int value2) {
		this.value2 = value2;
	}

	public String getStr1() {
		return this.str1;
	}

	public void setStr1(final String str1) {
		this.str1 = str1;
	}

}
