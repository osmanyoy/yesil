package com.yapikredi.java.dp.structural.bridge;

public class Araba extends Arac {

	private YakitTipi yaTip;
	private String arabaName;

	public Araba(final YakitTipi yaTip, final String arabaName) {
		super();
		this.yaTip = yaTip;
		this.arabaName = arabaName;
	}

	@Override
	public void ileriGit() {
		this.yaTip.ileriGit(this.arabaName);
	}
}
