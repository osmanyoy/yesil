package com.metod.java.training.projects.customer.processors;

import java.util.Scanner;

import com.metod.java.training.projects.customer.dao.Customer;

public interface ICustomerProcessor {
    void process(Customer customer, Scanner scanner);
}
