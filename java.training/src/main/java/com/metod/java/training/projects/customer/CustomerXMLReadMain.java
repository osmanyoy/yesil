package com.metod.java.training.projects.customer;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.metod.java.training.projects.customer.dao.Account;
import com.metod.java.training.projects.customer.dao.Customer;
import com.metod.java.training.projects.customer.dao.CustomerList;
import com.metod.java.training.projects.customer.dao.EAccountType;

public class CustomerXMLReadMain {
    public static void main(final String[] args) {
        try {
            CustomerList customerList = new CustomerList();
            List<Customer> customers = customerList.getCustomers();

            Customer customer = new Customer("osman",
                                             "1234",
                                             "osman",
                                             "aya");
            customer.addAccount(new Account(EAccountType.EURO,
                                            1000,
                                            "osman EURO account"));
            customer.addAccount(new Account(EAccountType.TL,
                                            10000,
                                            "osman TL account"));
            customers.add(customer);

            customer = new Customer("mehmet",
                                    "1234",
                                    "mehmet",
                                    "aya");
            customer.addAccount(new Account(EAccountType.DOLAR,
                                            1000,
                                            "mehmet EURO account"));
            customer.addAccount(new Account(EAccountType.TL,
                                            10000,
                                            "mehmet TL account"));
            customers.add(customer);

            customer = new Customer("ali",
                                    "1234",
                                    "ali",
                                    "aya");
            customer.addAccount(new Account(EAccountType.DOLAR,
                                            1000,
                                            "ali EURO account"));
            customer.addAccount(new Account(EAccountType.TL,
                                            10000,
                                            "ali TL account"));

            customers.add(customer);

            JAXBContext newContext = JAXBContext.newInstance(CustomerList.class);
            Marshaller createMarshaller = newContext.createMarshaller();
            createMarshaller.marshal(customerList, System.out);

            Unmarshaller createUnmarshaller = newContext.createUnmarshaller();
            File file = new File("cust.xml");
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("\n");
            CustomerList customerList2 = (CustomerList) createUnmarshaller.unmarshal(fileInputStream);
            System.out.println(customerList2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
