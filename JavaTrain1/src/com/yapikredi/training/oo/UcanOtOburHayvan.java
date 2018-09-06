package com.yapikredi.training.oo;

public abstract class UcanOtOburHayvan extends OtOburHayvan {

	public UcanOtOburHayvan(String name) {
		super(name);
		System.out.println("UcanOtOburHayvan constructor");
	}
	
	public final void hareket() {
		System.out.println("uç");
	}

}
