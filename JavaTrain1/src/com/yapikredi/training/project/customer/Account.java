package com.yapikredi.training.project.customer;

public class Account {
	private String name;
	private double amount;
	private EAccountType accounType;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public EAccountType getAccounType() {
		return accounType;
	}
	public void setAccounType(EAccountType accounType) {
		this.accounType = accounType;
	}
	
	@Override
	public String toString() {
		return name + accounType + " hesabýnýzda : " + amount + accounType + " var.";
	}
}
