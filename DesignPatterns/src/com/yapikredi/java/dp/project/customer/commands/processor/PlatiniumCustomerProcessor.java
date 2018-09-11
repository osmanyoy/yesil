package com.yapikredi.java.dp.project.customer.commands.processor;

import com.yapikredi.java.dp.project.customer.commands.EUROHesabiGor;
import com.yapikredi.java.dp.project.customer.commands.EUROHesabindanParaCek;
import com.yapikredi.java.dp.project.customer.commands.EUROHesabindanParaYatir;

public class PlatiniumCustomerProcessor extends GoldCustomerProcessor {

	public PlatiniumCustomerProcessor() {
		this.getCommands().add(new EUROHesabiGor());
		this.getCommands().add(new EUROHesabindanParaCek());
		this.getCommands().add(new EUROHesabindanParaYatir());
	}

}
