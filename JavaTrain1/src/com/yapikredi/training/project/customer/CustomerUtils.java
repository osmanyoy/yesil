package com.yapikredi.training.project.customer;

import java.util.List;
import java.util.Scanner;

import com.yapikredi.training.java.Customer;

public class CustomerUtils {
	public static Account findAccount(EAccountType accountType,Customer customer) {
		List<Account> accounts = customer.getAccounts();
		for (Account account : accounts) {
			if (account.getAccounType() == accountType) {
				return account;
			}
		}
		return null;
	}
	
	public static void paraCek(Scanner scanner,Customer customer,EAccountType accountType) {
		Account findAccount = CustomerUtils.findAccount(accountType, customer);
		if (findAccount != null) {
			System.out.println("Çekmek istediðiniz " + accountType + "  miktarýný giriniz :");
			double nextDouble = scanner.nextDouble();
			if (nextDouble > 0) {
				findAccount.setAmount(findAccount.getAmount() - nextDouble);
			}
			System.out.println(findAccount);
		} else {
			System.out.println("Böyle bir hesabýnýz yok.");
		}
	}

	public static void paraYatir(Scanner scanner,Customer customer,EAccountType accountType) {
		Account findAccount = CustomerUtils.findAccount(accountType, customer);
		if (findAccount != null) {
			System.out.println("Yatýrmak istediðiniz " + accountType + "  miktarýný giriniz :");
			double nextDouble = scanner.nextDouble();
			if (nextDouble > 0) {
				findAccount.setAmount(findAccount.getAmount() + nextDouble);
			}
			System.out.println(findAccount);
		} else {
			System.out.println("Böyle bir hesabýnýz yok.");
		}
	}
	
	public static void hesapGoruntule(Customer customer,EAccountType accountType) {
		Account findAccount = CustomerUtils.findAccount(accountType, customer);
		if (findAccount != null) {
			System.out.println(findAccount);
		} else {
			System.out.println("Böyle bir hesabýnýz yok.");
		}

	}

}
