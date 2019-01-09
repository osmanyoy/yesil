package com.example.demo;

public class SystemCounter {
	private long index = 0;

	public long getIndex() {
		return index;
	}
	
	public long increase() {
		return ++index;
	}

}
