package com.yapikredi.java.dp.behavior.memento;

public class MementoMain {
	public static void main(final String[] args) {
		Session session = new Session();
		session.increaseCounter();
		session.setCookie("cookie1");
		session.setName("session1");

		CareTaker careTaker = new CareTaker();
		careTaker.addMemento(session);

		session.increaseCounter();
		session.setCookie("cookie2");

		careTaker.addMemento(session);

		session.increaseCounter();
		session.setCookie("cookie3");
		careTaker.addMemento(session);

		session = careTaker.returnToHistory(0);
		System.out.println(session);

		session = careTaker.returnToHistory(1);
		System.out.println(session);

	}
}
