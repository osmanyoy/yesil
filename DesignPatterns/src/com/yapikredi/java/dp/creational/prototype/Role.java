package com.yapikredi.java.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Role implements Cloneable {
	// Static
	private List<String> access = new ArrayList<>();

	private List<String> history = new ArrayList<>();

	public boolean canIEnter(final String name) {
		return true;
	}

	@Override
	public Role clone() {
		Role role = new Role();
		role.access = this.access;
		return role;
	}

}
