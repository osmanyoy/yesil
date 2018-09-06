package com.yapikredi.training.oo;

public abstract class OtOburHayvan extends Hayvan{
	
	public OtOburHayvan(String name) {
		super(name);
		System.out.println("OtOburHayvan constructor");

	}
	
	public void yeme() {
		System.out.println("ot");
	}

}
