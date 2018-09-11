package com.yapikredi.java.dp.project.customer.commands.processor;

import com.yapikredi.java.dp.project.customer.Customer;

public class CustomerProcessorFactory {
	public static CustomerProcessor createCustomerProcessor(final Customer customer) {
		switch (customer.getCustomerType()) {
		case GOLD:
			return new GoldCustomerProcessor();
		case PLANTINIUM:
			return new PlatiniumCustomerProcessor();
		case SILVER:
			return new SilverCustomerProcessor();
		default:
			return new SilverCustomerProcessor();
		}
	}
}
