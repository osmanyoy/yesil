package com.yapikredi.training.collentions;

public class StringUtils {
	
	public static String addDigits(int value,int digits) {
		String val = "" + value;
		if (val.length() >= digits) {
			return val;
		}
		int delta = digits- val.length();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < delta; i++) {
			stringBuilder.append("0");
		}
		stringBuilder.append(val);
		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(StringUtils.addDigits(1, 3));
		System.out.println(StringUtils.addDigits(10, 3));
		System.out.println(StringUtils.addDigits(100, 3));
		System.out.println(StringUtils.addDigits(1000, 3));
	}
}
