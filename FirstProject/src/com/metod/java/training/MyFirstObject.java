package com.metod.java.training;

public class MyFirstObject {
	private int intValue;
	private int intValue2 = 15;
	private int intValue3 = 15;
	private int intValue4 = 15;
	private int intValue5 = 15;
	private int intValue6 = 15;
	private int intValue7 = 15;
	private int intValue8 = 15;
	private int intValue9 = 15;
	private int intValue10 = 15;
	private int intValue11 = 15;

	public MyFirstObject(final int intValueParam) {
		this.intValue = intValueParam;
	}

	// Tip 1 obje yaratma
	public MyFirstObject(final int intValue, final int intValue2, final int intValue3, final int intValue4,
			final int intValue5) {
		super();
		this.intValue = intValue;
		this.intValue2 = intValue2;
		this.intValue3 = intValue3;
		this.intValue4 = intValue4;
		this.intValue5 = intValue5;
	}

	// Tip 2 obje yaratma
	public MyFirstObject(final int intValue, final int intValue2, final int intValue8, final int intValue9,
			final int intValue10, final int intValue11) {
		super();
		this.intValue = intValue;
		this.intValue2 = intValue2;
		this.intValue8 = intValue8;
		this.intValue9 = intValue9;
		this.intValue10 = intValue10;
		this.intValue11 = intValue11;
	}

	private void method1() {

	}

	public int getIntValue() {
		return this.intValue;
	}

	public void setIntValue(final int intValue) {
		if (intValue < 0) {
			this.intValue = 1;
		} else {
			this.intValue = intValue;
		}
	}

}
