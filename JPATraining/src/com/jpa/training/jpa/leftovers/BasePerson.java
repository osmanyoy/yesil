package com.jpa.training.jpa.leftovers;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasePerson {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long personId;

	public long getPersonId() {
		return this.personId;
	}

	public void setPersonId(final long personId) {
		this.personId = personId;
	}

}
