package com.jpa.training.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private long depId;

	private String depName;
	private String depDesc;

	public long getDepId() {
		return this.depId;
	}

	public void setDepId(final long depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(final String depName) {
		this.depName = depName;
	}

	public String getDepDesc() {
		return this.depDesc;
	}

	public void setDepDesc(final String depDesc) {
		this.depDesc = depDesc;
	}

}
