package com.yapikredi.java.dp.creational.objectpooling;

public class PoolMain {
	public static void main(final String[] args) {
		ObjectPool objectPool = new ObjectPool();

		MyObject myObject = null;
		try {
			myObject = objectPool.getMyObject();
		} finally {
			if (myObject != null) {
				objectPool.returnMyObject(myObject);
			}
		}

		// Generic
		GenericPool<MyObject> genericPool = new GenericPool<>();
		MyObject myObject2 = null;
		try {
			myObject2 = genericPool.getObject();
		} finally {
			if (myObject2 != null) {
				genericPool.returnObject(myObject2);
			}
		}
	}
}
