package com.metod.java.training;

public class MyFirstObject2 {
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

	private MyFirstObject2() {
	}

	// Tip 1 obje yaratma
	public static MyFirstObject2 createTip1Object(final int intValue, final int intValue2, final int intValue3,
			final int intValue4, final int intValue5) {
		MyFirstObject2 firstObject2 = new MyFirstObject2();
		firstObject2.intValue = intValue;
		firstObject2.intValue2 = intValue2;
		firstObject2.intValue3 = intValue3;
		firstObject2.intValue4 = intValue4;
		firstObject2.intValue5 = intValue5;
		return firstObject2;
	}

	// Tip 2 obje yaratma
	public static MyFirstObject2 createTip2Object(final int intValue, final int intValue2, final int intValue8,
			final int intValue9, final int intValue10, final int intValue11) {
		MyFirstObject2 firstObject2 = new MyFirstObject2();
		firstObject2.intValue = intValue;
		firstObject2.intValue2 = intValue2;
		firstObject2.intValue8 = intValue8;
		firstObject2.intValue9 = intValue9;
		firstObject2.intValue10 = intValue10;
		firstObject2.intValue11 = intValue11;
		return firstObject2;
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
