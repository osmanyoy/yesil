package com.yapikredi.java.dp.structural.bridge;

public class ElektrikliYakitTipi extends YakitTipi {

	@Override
	public void ileriGit(final String name) {
		System.out.println("Elektrikli " + name + " ileri gidiyor");
	}

}
