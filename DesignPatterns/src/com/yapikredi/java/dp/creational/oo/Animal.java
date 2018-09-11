package com.yapikredi.java.dp.creational.oo;

public abstract class Animal implements IAnimal {

	private String name = "animal";
	private String animalVoice;

	public Animal(final String animalVoice) {
		this.animalVoice = animalVoice;
	}

//	public String speak() {
//		System.out.println(this.getAnimalVoice());
//		return this.getAnimalVoice();
//	}

	@Override
	public String speak() {
		System.out.println(this.animalVoice);
		return this.animalVoice;
	}

	public abstract String getAnimalVoice();

	@Override
	public void uyu() {
		System.out.println("ZZZZZZZZzzzzzz");
	}

}
