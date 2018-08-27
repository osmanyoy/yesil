package com.java.performance;

public class MicroBench {
	
	public static void main(String[] args) {
 		long delta = System.nanoTime();
		int count = 0;
		for (int i = 0; i < 100_000_000; i++) {
			count++;
		}
		delta = System.nanoTime() - delta;
		System.out.println("Delta : " + delta);
		System.gc();
		try {
			Thread.sleep(2_000);
		} catch (Exception e) {
		}
		
		delta = System.nanoTime();
		count = 0;
		for (int i = 0; i < 100_000_000; i++) {
			count++;
		}
		delta = System.nanoTime() - delta;
		System.out.println("Delta : " + delta);
	
	}
	
}
