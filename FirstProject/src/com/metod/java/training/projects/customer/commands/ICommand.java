package com.metod.java.training.projects.customer.commands;

import java.util.Scanner;

import com.metod.java.training.projects.customer.Customer;

public interface ICommand {
    void execute(Scanner scanner, Customer customer);
}
