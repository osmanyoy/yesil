package com.yapikredi.training.project.customer;

import java.util.Scanner;

import com.yapikredi.training.java.Customer;

public interface ICommand {
	void execute(Scanner scanner, Customer customer);
	
	String getMenuDesc();
}
