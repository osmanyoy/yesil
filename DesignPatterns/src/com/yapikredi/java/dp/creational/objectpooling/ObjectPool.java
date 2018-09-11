package com.yapikredi.java.dp.creational.objectpooling;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ObjectPool {
	private Queue<MyObject> pool = new ArrayBlockingQueue<>(1000);

	public MyObject getMyObject() {
		return this.pool.poll();
	}

	public void returnMyObject(final MyObject myObject) {
		this.pool.add(myObject);
	}

}
