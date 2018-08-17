package com.metod.java.training.projects.customer.commands;

import java.util.Scanner;

import com.metod.java.training.projects.customer.dao.Customer;
import com.metod.java.training.projects.customer.dao.EAccountType;

public class DepositTLCommand implements ICommand {

    @Override
    public void execute(final Scanner scanner, final Customer customer) {
        CustomerUtils.deposit(scanner, customer, EAccountType.TL);
    }

    @Override
    public String getDescription() {
        return "Tl yatýr";
    }

}
