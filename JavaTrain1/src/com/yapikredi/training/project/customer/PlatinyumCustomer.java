package com.yapikredi.training.project.customer;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.training.java.Customer;
import com.yapikredi.training.project.customer.commands.DolarBozdur;
import com.yapikredi.training.project.customer.commands.DolarHesabiGoruntuleme;
import com.yapikredi.training.project.customer.commands.DolarParaCek;
import com.yapikredi.training.project.customer.commands.DolarParaYatir;
import com.yapikredi.training.project.customer.commands.EuroHesabiGoruntuleme;
import com.yapikredi.training.project.customer.commands.EuroParaCek;
import com.yapikredi.training.project.customer.commands.EuroParaYatir;

public class PlatinyumCustomer extends AltinCustomer {

	public PlatinyumCustomer(String name, String surname, int age, String username, String password) {
		super(name, surname, age, username, password);
		List<Account> accounts = getAccounts();

		// EURO Account u yarat
		Account euroAccount = new Account();
		euroAccount.setAccounType(EAccountType.EURO);

		// EURO account ekle
		accounts.add(euroAccount);
	
		addCommand(new EuroHesabiGoruntuleme());
		addCommand(new EuroParaYatir());
		addCommand(new EuroParaCek());
		
		addCommand(new DolarBozdur());

	}

}
