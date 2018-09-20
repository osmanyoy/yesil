package com.jpa.training.rest;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private long addId;

	private String city;
	private String street;

	@XmlTransient
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Employee employee;

	public long getAddId() {
		return this.addId;
	}

	public void setAddId(final long addId) {
		this.addId = addId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(final String street) {
		this.street = street;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

}
