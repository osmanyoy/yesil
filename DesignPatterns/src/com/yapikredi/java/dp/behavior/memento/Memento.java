package com.yapikredi.java.dp.behavior.memento;

public class Memento {
	private Session session;

	public Memento(final Session sessionParam) {
		this.session = new Session();
		this.session.setCookie(sessionParam.getCookie());
		this.session.setCounter(sessionParam.getCounter());
		this.session.setName(sessionParam.getName());
	}

	public Session getSession() {
		return this.session;
	}

	public void setSession(final Session session) {
		this.session = session;
	}

}
