package com.metod.java.training.projects.customer.dao;

public class CustomerDBTest {
    public static void main(final String[] args) {
        System.getProperties()
              .put("customer.dao.type", "db");
        ICustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
        Customer customer = new Customer("osman",
                                         "1234",
                                         "osman",
                                         "aya");
        customer.setCustomerType(ECustomerType.PLATINIUM);
        Account account = new Account(EAccountType.DOLAR,
                                      1000,
                                      "osman DOLAR account");
        account.setCustomer(customer);
        customer.addAccount(account);
        Account account2 = new Account(EAccountType.EURO,
                                       1000,
                                       "osman EURO account");
        account2.setCustomer(customer);
        customer.addAccount(account2);
        Account account3 = new Account(EAccountType.TL,
                                       10000,
                                       "osman TL account");
        account3.setCustomer(customer);
        customer.addAccount(account3);
        customerDAO.addCustomer(customer);
    }
}
