package com.training.dp.creation.general;


public class CustomerFactory {

    public static Customer createCustomer(final int index) {
        Customer customerDeco = null;

        switch (index) {
            case 1:
                customerDeco = new Customer("yay",
                                            "osman");
                break;
            case 2:
                customerDeco = new CustomerPrefixDeco(new Customer("yay",
                                                                   "osman"));
                break;
            case 3:
                customerDeco = new CustomerSufixDeco(new CustomerPrefixDeco(new Customer("yay",
                                                                                         "osman")));
                break;

            default:
                customerDeco = new Customer("yay",
                                            "osman");
                break;
        }
        return customerDeco;
    }
}
