package com.jpa.training.rest;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class MyThirdEntity {

	public MyThirdEntity() {
	}

	public MyThirdEntity(final String str1, final String str2, final String str3) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
	}

	@Id
	private long mteId;

	private String str1;
	private String str2;
	private String str3;

	@XmlTransient
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@MapsId
	private MyFirstEntity myFirstEntity;

	public long getMteId() {
		return this.mteId;
	}

	public void setMteId(final long mteId) {
		this.mteId = mteId;
	}

	public String getStr1() {
		return this.str1;
	}

	public void setStr1(final String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return this.str2;
	}

	public void setStr2(final String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return this.str3;
	}

	public void setStr3(final String str3) {
		this.str3 = str3;
	}

	public MyFirstEntity getMyFirstEntity() {
		return this.myFirstEntity;
	}

	public void setMyFirstEntity(final MyFirstEntity myFirstEntity) {
		this.myFirstEntity = myFirstEntity;
	}

}
