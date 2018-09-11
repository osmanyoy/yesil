package com.yapikredi.java.dp.creational.oo;

public class Cat extends Animal {

	public Cat() {
		super("miyav");
	}

	@Override
	public String getAnimalVoice() {
		return "miyav";
	}

	@Override
	public int move() {
		return 5;
	}

	@Override
	public String eat() {
		return "kedi mamasý";
	}

}
