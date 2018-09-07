package com.yapikredi.training.project.customer.commands;

import java.util.Scanner;

import com.yapikredi.training.java.Customer;
import com.yapikredi.training.project.customer.Account;
import com.yapikredi.training.project.customer.CustomerUtils;
import com.yapikredi.training.project.customer.EAccountType;
import com.yapikredi.training.project.customer.ICommand;

public class DolarHesabiGoruntuleme implements ICommand{

	@Override
	public void execute(Scanner scanner, Customer customer) {
		CustomerUtils.hesapGoruntule(customer, EAccountType.DOLAR);
	}

	@Override
	public String getMenuDesc() {
		return "DOLAR Hesabý görüntüle";
	}

}
