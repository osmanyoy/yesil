package com.yapikredi.java.dp.behavior.strategy;

public class StraMain {
	public static void main(final String[] args) {
		Asker asker = new Asker(new YariKeskinAtesTipi());
		asker.atesEt();
		asker.atesEt();
		asker.atesEt();
		asker.atesEt();
	}
}
