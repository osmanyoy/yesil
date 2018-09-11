package com.yapikredi.java.dp.creational.objectpooling;

public class PoolHolder<T> {
	private long releaseDate;
	private T object;

	public long getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(final long releaseDate) {
		this.releaseDate = releaseDate;
	}

	public T getObject() {
		return this.object;
	}

	public void setObject(final T object) {
		this.object = object;
	}

}
