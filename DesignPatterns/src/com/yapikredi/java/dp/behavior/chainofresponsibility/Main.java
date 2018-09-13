package com.yapikredi.java.dp.behavior.chainofresponsibility;

public class Main {
	public static void main(final String[] args) {
		IHandler iHandler = new NegativeHandler(
		        new ZeroHandler(new RangeFiftyHandler(new RangeFiftyToHundredHandler(null))));
		String handler = iHandler.handler(150);
		System.out.println(handler);
	}
}
