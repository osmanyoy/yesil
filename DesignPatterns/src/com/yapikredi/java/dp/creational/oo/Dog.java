package com.yapikredi.java.dp.creational.oo;

public class Dog extends Animal {

	public Dog() {
		super("Hav hav");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAnimalVoice() {
		return "hav hav";
	}

	@Override
	public int move() {
		return 5;
	}

	@Override
	public String eat() {
		return "köpek mamasý";
	}

}
