package com.yapikredi.java.dp.project.customer.commands;

import java.util.Scanner;

import com.yapikredi.java.dp.project.customer.Account;
import com.yapikredi.java.dp.project.customer.Customer;
import com.yapikredi.java.dp.project.customer.EAccountType;

public class DOLARHesabiGor implements ICommand {

	@Override
	public String getMenuDesc() {
		return "DOLAR Hesabý gör";
	}

	@Override
	public void execute(final Scanner scanner, final Customer customer) {
		Account account = customer.getAccount(EAccountType.DOLAR);
		if (account == null) {
			System.out.println("DOLAR Hesabýnýz yok. Bankaya danýþýn");
		}
		System.out.println(account);
	}

}
