package com.yapikredi.training.statics;

public class StringUtils {
	
	public static boolean isStringEmpty(String str) {
		return str == null || str.isEmpty();
	}

	public static boolean isStringNotEmpty(String str) {
		return str != null && !str.isEmpty();
	}
	
	public static String[] splitString(String str,String pattern) {
		String[] split = str.split(pattern);
		return split;
	}

}
