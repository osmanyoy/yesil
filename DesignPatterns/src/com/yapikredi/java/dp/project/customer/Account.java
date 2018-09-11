package com.yapikredi.java.dp.project.customer;

public class Account {
	private String accountName;
	private double amount;
	private EAccountType accountType;

	public Account() {
	}

	public Account(final String accountName, final double amount, final EAccountType accountType) {
		super();
		this.accountName = accountName;
		this.amount = amount;
		this.accountType = accountType;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(final String accountName) {
		this.accountName = accountName;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(final double amount) {
		this.amount = amount;
	}

	public EAccountType getAccountType() {
		return this.accountType;
	}

	public void setAccountType(final EAccountType accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + this.accountName + ", amount=" + this.amount + ", accountType="
		        + this.accountType + "]";
	}

}
