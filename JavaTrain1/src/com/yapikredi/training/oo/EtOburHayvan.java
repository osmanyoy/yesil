package com.yapikredi.training.oo;

public abstract class EtOburHayvan extends Hayvan {
	
	public EtOburHayvan(String name) {
		super(name);
		System.out.println("EtOburHayvan constructor");
	}

	public void yeme() {
		System.out.println("et");
	}
	
}
