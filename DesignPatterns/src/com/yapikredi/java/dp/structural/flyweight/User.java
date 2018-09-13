package com.yapikredi.java.dp.structural.flyweight;

public class User {
	private String name;
	private String username;
	private String password;

	private UserFlyweight userFlyweight;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public UserFlyweight getUserFlyweight() {
		return this.userFlyweight;
	}

	public void setUserFlyweight(final UserFlyweight userFlyweight) {
		this.userFlyweight = userFlyweight;
	}

}
