package com.metod.java.training.projects.customer.commands;

import java.util.Scanner;

import com.metod.java.training.projects.customer.Customer;
import com.metod.java.training.projects.customer.EAccountType;

public class WithdrawnEUROCommand implements ICommand {

    @Override
    public void execute(final Scanner scanner, final Customer customer) {
        CustomerUtils.withdrawn(scanner, customer, EAccountType.DOLAR);
    }

    @Override
    public String getDescription() {
        return "Euro çek";
    }

}
