package com.yapikredi.training.java;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.training.collentions.StringUtils;
import com.yapikredi.training.project.customer.Account;
import com.yapikredi.training.project.customer.EAccountType;
import com.yapikredi.training.project.customer.ECustomerType;
import com.yapikredi.training.project.customer.ICommand;

public class Customer {
	private String name;
	private String surname;
	private int age;
	private String username;
	private String password;
	private ECustomerType customerType;
	
	private List<Account> accounts;
	
	private List<ICommand> commands = new ArrayList<>();

	public Customer() {
	}
	
	public Customer(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public Customer(String name, String surname, int age, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.username = username;
		this.password = password;
	}
	
	public void addCommand(ICommand command) {
		commands.add(command);
	}
	
	public ICommand getCommand(int index) {
		return commands.get(index);
	}
	
	public List<ICommand> getAllCommand(){
		return commands;
	}
	
	public void setAccountAmount(EAccountType accountType,double amount,String name) {
		if (accounts != null) {
			for (Account account : accounts) {
				if (account.getAccounType() == accountType) {
					account.setAmount(amount);
					account.setName(name);
				}
			}
		}
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname +  ", age="
				+ StringUtils.addDigits(age, 3) + ", customerType=" + customerType +"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ECustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(ECustomerType customerType) {
		this.customerType = customerType;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
