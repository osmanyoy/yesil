package com.yapikredi.java.dp.behavior.strategy;

import java.util.Random;

public class YariKeskinAtesTipi extends AtesTipi {

	@Override
	public void atesEt() {
		Random random = new Random();
		int nextInt = random.nextInt(100);
		if (nextInt > 50) {
			System.out.println("Karavana");
		} else {
			System.out.println("Vurdum");
		}
	}
}
