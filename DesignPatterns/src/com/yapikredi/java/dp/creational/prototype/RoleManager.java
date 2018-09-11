package com.yapikredi.java.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class RoleManager {
	private Map<String, Role> roles = new HashMap<>();

	public Role getRole(final String name) {
		Role role = this.roles.get(name);
		return role.clone();
	}
}
