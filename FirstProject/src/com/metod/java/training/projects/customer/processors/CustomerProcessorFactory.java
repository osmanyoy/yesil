package com.metod.java.training.projects.customer.processors;

import com.metod.java.training.projects.customer.Customer;

public class CustomerProcessorFactory {
    public static ICustomerProcessor createCustomerProcessor(final Customer customer) {
        switch (customer.getCustomerType()) {
        case GOLD:
            return new GoldCustomerProcessor();
        case PLATINIUM:
            return new PlatiniumCustomerProcessor();
        case SILVER:
            return new SilverCustomerProcessor();
        default:
            return new SilverCustomerProcessor();
        }
    }
}
