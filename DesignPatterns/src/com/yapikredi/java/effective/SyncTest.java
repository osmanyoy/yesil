package com.yapikredi.java.effective;

public class SyncTest {
	public static class MyThread extends Thread {
		private static long count = 0;

		private static synchronized void increase() {
			MyThread.count++;
		}

		@Override
		public void run() {
			long delta = System.currentTimeMillis();
			for (int i = 0; i < 100_000_000; i++) {
				MyThread.increase();
			}
			System.out.println("Delta : " + (System.currentTimeMillis() - delta));
		}

	}

	public static void main(final String[] args) {
		for (int i = 0; i < 4; i++) {
			MyThread myThread = new MyThread();
			myThread.start();
		}
		try {
			Thread.sleep(5_000);
			System.out.println(MyThread.count);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
