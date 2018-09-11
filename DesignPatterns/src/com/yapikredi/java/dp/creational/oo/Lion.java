package com.yapikredi.java.dp.creational.oo;

public class Lion extends Animal {

	public Lion() {
		super("roor");
	}

	@Override
	public String getAnimalVoice() {
		return "Rooorr";
	}

	@Override
	public int move() {
		return 8;
	}

	@Override
	public String eat() {
		return "et";
	}

}
