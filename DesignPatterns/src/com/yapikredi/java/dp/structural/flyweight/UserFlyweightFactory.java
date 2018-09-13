package com.yapikredi.java.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UserFlyweightFactory {
	private static Map<EUserType, UserFlyweight> cache = new HashMap<>();

	public static UserFlyweight createFlyweight(final EUserType eUserType) {
		UserFlyweight userFlyweight = UserFlyweightFactory.cache.get(eUserType);
		// Cache e koy ve ver
		switch (eUserType) {
		case USER1:
		case USER2:
		case USER3:
		default:
			break;
		}
		return null;
	}
}
