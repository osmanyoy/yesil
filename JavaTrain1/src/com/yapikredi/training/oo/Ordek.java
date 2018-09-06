package com.yapikredi.training.oo;

public class Ordek extends UcanOtOburHayvan {
	
	public Ordek() {
		super("Ordek");
		System.out.println("Ördek Constructor");
	}
	
	@Override
	public void ses() {
		System.out.println("Vaakk");
	}
	
}
