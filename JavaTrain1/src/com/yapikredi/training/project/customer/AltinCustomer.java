package com.yapikredi.training.project.customer;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.training.java.Customer;
import com.yapikredi.training.project.customer.commands.DolarHesabiGoruntuleme;
import com.yapikredi.training.project.customer.commands.DolarParaCek;
import com.yapikredi.training.project.customer.commands.DolarParaYatir;
import com.yapikredi.training.project.customer.commands.TLParaCek;
import com.yapikredi.training.project.customer.commands.TLParaYatir;

public class AltinCustomer extends GumusCustomer {

	public AltinCustomer(String name, String surname, int age, String username, String password) {
		super(name, surname, age, username, password);
		List<Account> accounts = getAccounts();

		// DOLAR Account u yarat
		Account dolarAccount = new Account();
		dolarAccount.setAccounType(EAccountType.DOLAR);

		// DOLAR account ekle
		accounts.add(dolarAccount);
		
		addCommand(new DolarHesabiGoruntuleme());
		addCommand(new DolarParaYatir());
		addCommand(new DolarParaCek());

	}

}
