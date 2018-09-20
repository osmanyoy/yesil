package com.jpa.training.jpa.leftovers;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ogrenci")
public class Student extends Person {
	private String studentNo;

	public String getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(final String studentNo) {
		this.studentNo = studentNo;
	}

}
