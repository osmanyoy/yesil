package com.yapikredi.java.dp.project.customer.commands;

import java.util.Scanner;

import com.yapikredi.java.dp.project.customer.Customer;
import com.yapikredi.java.dp.project.customer.EAccountType;

public class TLHesabindanParaCek extends AbstractCommand {

	@Override
	public String getMenuDesc() {
		return "TL Hesabýndan para çek";
	}

	@Override
	public void execute(final Scanner scanner, final Customer customer) {
		this.hesapCekimi(scanner,
		                 customer,
		                 EAccountType.TL);
	}

}
