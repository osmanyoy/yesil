package com.jpa.training.jpa.leftovers;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("evkadini")
public class HouseWife extends Person {
	private String address;

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

}
