package com.yapikredi.training.project.customer;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.training.java.Customer;
import com.yapikredi.training.project.customer.commands.TLHesabiGoruntuleme;
import com.yapikredi.training.project.customer.commands.TLParaCek;
import com.yapikredi.training.project.customer.commands.TLParaYatir;

public class GumusCustomer extends Customer {

	public GumusCustomer(String name, String surname, int age, String username, String password) {
		super(name, surname, age, username, password);
		setCustomerType(ECustomerType.GUMUS);
		
		// Liste yarat
		List<Account> accounts = new ArrayList<>();
		
		// TL Account u yarat
		Account tlAccount = new Account();
		tlAccount.setAccounType(EAccountType.TL);
		
		// Listeye ekle
		accounts.add(tlAccount);
		
		//Customer a listeyi set et
		setAccounts(accounts);
		
		// TL Göster komutu ekle
		addCommand(new TLHesabiGoruntuleme());
		addCommand(new TLParaYatir());
		addCommand(new TLParaCek());
	}

}
