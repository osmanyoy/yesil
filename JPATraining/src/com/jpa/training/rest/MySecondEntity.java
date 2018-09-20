package com.jpa.training.rest;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MySecondEntity {

	public MySecondEntity() {
	}

	public MySecondEntity(final String username, final String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public MySecondEntity(final String username) {
		super();
		this.username = username;
	}

	public static MySecondEntity createObjeType1(final String username, final String password) {
		MySecondEntity mySecondEntity = new MySecondEntity();
		mySecondEntity.username = username;
		mySecondEntity.password = password;
		return mySecondEntity;
	}

	public static MySecondEntity getBuilder() {
		MySecondEntity mySecondEntity = new MySecondEntity();
		return mySecondEntity;
	}

	@Column(name = "sanane")
	private String username;
	private String password;

	public String getUsername() {
		return this.username;
	}

	public MySecondEntity setUsername(final String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return this.password;
	}

	public MySecondEntity setPassword(final String password) {
		this.password = password;
		return this;
	}

	public MySecondEntity createObjeType1() {
		// validate
		return this;
	}

}
