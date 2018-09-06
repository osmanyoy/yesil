package com.yapikredi.training.oo;

public class OOMain {
	
	public static void main(String[] args) {
		final int a = 100;
		final IAnimal hayvan = new Ordek();
		
		hayvan.ses();
		hayvan.hareket();
		hayvan.yeme();
	}
	
	
}
