package com.yapikredi.java.dp.behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementos = new ArrayList<>();
	private int current = -1;

	public void addMemento(final Session session) {
		Memento memento = new Memento(session);
		this.mementos.add(memento);
	}

	public Session returnToHistory(final int index) {
		this.current = index;
		return this.mementos.get(index)
		                    .getSession();
	}

	public Session returPrev() {
		if ((this.current > 0) && (this.current < this.mementos.size())) {
			this.current = this.current - 1;
			return this.mementos.get(this.current)
			                    .getSession();
		}
		return null;
	}
}
