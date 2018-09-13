package com.yapikredi.java.dp.structural.adapter;

public class Employee {
	private String isim;
	private String soyisim;
	private int yas;

	public Employee(final String isim, final String soyisim, final int yas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
	}

	public String getIsim() {
		return this.isim;
	}

	public void setIsim(final String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return this.soyisim;
	}

	public void setSoyisim(final String soyisim) {
		this.soyisim = soyisim;
	}

	public int getYas() {
		return this.yas;
	}

	public void setYas(final int yas) {
		this.yas = yas;
	}

}
