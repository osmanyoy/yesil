package com.yapikredi.training.oo;

public abstract class Hayvan implements IAnimal{
	
	private String name;
	
	public Hayvan(String name) {
		this.name = name;
		System.out.println("Hayvan constructor");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
