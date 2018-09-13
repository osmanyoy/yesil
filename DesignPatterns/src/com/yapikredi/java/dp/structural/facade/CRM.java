package com.yapikredi.java.dp.structural.facade;

import com.yapikredi.java.dp.structural.adapter.Person;

public class CRM {
	public void reserve(final Person person) {
		System.out.println("CRM reserve");
	}

	public void rollback(final Person person) {
		System.out.println("CRM rollback");

	}

	public void save(final Person person) {
		System.out.println("CRM save");

	}
}
