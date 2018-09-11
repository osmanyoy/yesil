package com.yapikredi.java.dp.project.customer.commands;

import java.util.Scanner;

import com.yapikredi.java.dp.project.customer.Account;
import com.yapikredi.java.dp.project.customer.Customer;
import com.yapikredi.java.dp.project.customer.EAccountType;

public abstract class AbstractCommand implements ICommand {

	void hesapCekimi(final Scanner scanner, final Customer customer, final EAccountType accountType) {
		Account account = customer.getAccount(accountType);
		if (account == null) {
			System.out.println(accountType + " Hesabýnýz yok. Bankaya danýþýn");
		}
		System.out.println(account);
		System.out.println("Çekeceðiniz miktar : ");
		double nextDouble = scanner.nextDouble();
		account.setAmount(account.getAmount() - nextDouble);
	}

	void hesapYatirimi(final Scanner scanner, final Customer customer, final EAccountType accountType) {
		Account account = customer.getAccount(accountType);
		if (account == null) {
			System.out.println(accountType + " Hesabýnýz yok. Bankaya danýþýn");
		}
		System.out.println(account);
		System.out.println("Yatiracaðýnýz miktar : ");
		double nextDouble = scanner.nextDouble();
		account.setAmount(account.getAmount() + nextDouble);
	}

}
