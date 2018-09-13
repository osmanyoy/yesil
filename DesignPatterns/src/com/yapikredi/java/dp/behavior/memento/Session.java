package com.yapikredi.java.dp.behavior.memento;

public class Session {
	private String cookie;
	private String name;
	private long counter;

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(final String cookie) {
		this.cookie = cookie;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public long getCounter() {
		return this.counter;
	}

	public void setCounter(final long counter) {
		this.counter = counter;
	}

	public void increaseCounter() {
		this.counter++;

	}

	@Override
	public String toString() {
		return "Session [cookie=" + this.cookie + ", name=" + this.name + ", counter=" + this.counter + "]";
	}

}
