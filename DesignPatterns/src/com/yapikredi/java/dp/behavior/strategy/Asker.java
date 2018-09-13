package com.yapikredi.java.dp.behavior.strategy;

public class Asker {

	private AtesTipi atesTipi;

	public Asker(final AtesTipi atesTipi) {
		super();
		this.atesTipi = atesTipi;
	}

	public void atesEt() {
		this.atesTipi.atesEt();
	}

}
