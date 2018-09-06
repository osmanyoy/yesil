package com.yapikredi.training.loops;

public class LoopMain {
	public static void main(String[] args) {
		// FOR
		abc: for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 100; i++) {
				if (i == 20) {
					// break;
					continue abc;
				}
				System.out.println("FOR LOOP START: " + i);
				if (i > 10 && i < 20) {
					continue;
				}
				System.out.println("FOR LOOP END: " + i);
			}
			System.out.println("------------- Outter loop : " + j);
		}

		// WHILE
		int count = 0;
		while (count < 100) {
			if (count == 20) {
				break;
			}
			count++;
		}

		// DO WHILE
		int sayac = 0;
		do {
			if (sayac == 20) {
				break;
			}
			sayac++;
		} while (sayac < 100);

	}
}
