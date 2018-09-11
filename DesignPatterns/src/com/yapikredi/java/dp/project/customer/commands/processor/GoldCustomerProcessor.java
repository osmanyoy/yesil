package com.yapikredi.java.dp.project.customer.commands.processor;

import com.yapikredi.java.dp.project.customer.commands.DOLARBozdur;
import com.yapikredi.java.dp.project.customer.commands.DOLARHesabiGor;
import com.yapikredi.java.dp.project.customer.commands.DOLARHesabindanParaCek;
import com.yapikredi.java.dp.project.customer.commands.DOLARHesabindanParaYatir;

public class GoldCustomerProcessor extends SilverCustomerProcessor {

	public GoldCustomerProcessor() {
		this.getCommands()
		    .add(new DOLARHesabiGor());
		this.getCommands()
		    .add(new DOLARHesabindanParaCek());
		this.getCommands()
		    .add(new DOLARHesabindanParaYatir());
		this.getCommands()
		    .add(new DOLARBozdur());
	}

}
