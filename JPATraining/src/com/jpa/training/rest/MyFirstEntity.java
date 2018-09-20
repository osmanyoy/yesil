package com.jpa.training.rest;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "isimler", indexes = { @Index(columnList = "value1,value2", name = "test_index", unique = false) })
@SecondaryTable(name = "second_table")
public class MyFirstEntity {

	@Id
	@GeneratedValue
	private long mfeId;

	private String value1;
	private String value2;

	@Column(table = "second_table")
	private int value3;

	@Column(name = "test_mest", length = 20, nullable = true, table = "second_table")
	private String testMest;

	@Embedded
	@AttributeOverride(name = "username", column = @Column(name = "kullanici_adi"))
	private MySecondEntity mySecondEntity;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "myFirstEntity")
	// @JoinColumn(name = "third_entity_id")
	private MyThirdEntity myThirdEntity;

	public String getValue1() {
		return this.value1;
	}

	public void setValue1(final String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return this.value2;
	}

	public void setValue2(final String value2) {
		this.value2 = value2;
	}

	public int getValue3() {
		return this.value3;
	}

	public void setValue3(final int value3) {
		this.value3 = value3;
	}

	public long getMfeId() {
		return this.mfeId;
	}

	public void setMfeId(final long mfeId) {
		this.mfeId = mfeId;
	}

	public String getTestMest() {
		return this.testMest;
	}

	public void setTestMest(final String testMest) {
		this.testMest = testMest;
	}

	public MySecondEntity getMySecondEntity() {
		return this.mySecondEntity;
	}

	public void setMySecondEntity(final MySecondEntity mySecondEntity) {
		this.mySecondEntity = mySecondEntity;
	}

	public MyThirdEntity getMyThirdEntity() {
		return this.myThirdEntity;
	}

	public void setMyThirdEntity(final MyThirdEntity myThirdEntity) {
		this.myThirdEntity = myThirdEntity;
	}

}
