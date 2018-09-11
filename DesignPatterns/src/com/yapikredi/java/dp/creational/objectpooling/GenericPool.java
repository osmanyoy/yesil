package com.yapikredi.java.dp.creational.objectpooling;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class GenericPool<T> {
	private BlockingQueue<PoolHolder<T>> pool = new ArrayBlockingQueue<>(1000);
	private Set<PoolHolder<T>> released = new HashSet<>(1000);

	public T getObject() {
		try {
			PoolHolder<T> polled = this.pool.poll(1000,
			                                      TimeUnit.MILLISECONDS);
			if (polled != null) {
				this.released.add(polled);
				return polled.getObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void returnObject(final T t) {

	}

	public static class CheckerThread extends Thread {
		private GenericPool<?> genericPool;

		public CheckerThread(final GenericPool<?> genericPool) {
			this.genericPool = genericPool;
		}

		@Override
		public void run() {
			while (true) {
				try {
					for (PoolHolder<?> object : this.genericPool.released) {
						long releaseDate = object.getReleaseDate();
						if ((System.currentTimeMillis() - releaseDate) > 10_000) {
							this.genericPool.released.remove(object);

						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
