package com.yapikredi.training.project.customer.commands;

import java.util.Scanner;

import com.yapikredi.training.java.Customer;
import com.yapikredi.training.project.customer.Account;
import com.yapikredi.training.project.customer.CustomerUtils;
import com.yapikredi.training.project.customer.EAccountType;
import com.yapikredi.training.project.customer.ICommand;

public class DolarBozdur implements ICommand {

	@Override
	public void execute(Scanner scanner, Customer customer) {
		Account tlAccount = CustomerUtils.findAccount(EAccountType.TL, customer);
		Account dolarAccount = CustomerUtils.findAccount(EAccountType.DOLAR, customer);
		System.out.println("Bozduracaðýnýz DOLAR ne kadar : ");
		double nextDouble = scanner.nextDouble();
		
		double tlAdd = nextDouble*6;
		tlAccount.setAmount(tlAccount.getAmount() + tlAdd);
		dolarAccount.setAmount(dolarAccount.getAmount() - nextDouble);
		
		System.out.println(tlAccount);
		
	}

	@Override
	public String getMenuDesc() {
		return "DOLAR Bozdur";
	}

}
