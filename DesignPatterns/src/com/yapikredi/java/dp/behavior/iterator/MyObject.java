package com.yapikredi.java.dp.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyObject {
	private List<String> strings = new ArrayList<>();

	public void add(final String string) {
		this.strings.add(string);
	}

	public void remove(final String string) {
		this.strings.remove(string);
	}

	public Iterator<String> getItretor() {
		IterateMyObject iterateMyObject = new IterateMyObject(this);
		return iterateMyObject;
	}

	public String get(final int index) {
		return this.strings.get(index);
	}

	public static class IterateMyObject implements Iterator<String> {
		private int current;
		private MyObject myObject;

		public IterateMyObject(final MyObject myObject) {
			this.myObject = myObject;

		}

		@Override
		public boolean hasNext() {
			return this.myObject.strings.size() > this.current;
		}

		@Override
		public String next() {
			return this.myObject.strings.get(this.current++);
		}

	}

}
