package com.yapikredi.training.project.customer;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.yapikredi.training.java.Customer;

public class CustomerXMLMain {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(CustomerList.class);
			Marshaller createMarshaller = context.createMarshaller();
			File file = new File("customer.xml");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			CustomerList customerList = new CustomerList();
			List<Customer> customers = new ArrayList<>();
			
			GumusCustomer gumusCustomer =  new GumusCustomer("osman", "yayciouglu", 48, "osman", "1234");
			gumusCustomer.setAccountAmount(EAccountType.TL, 1000, "Osman TL account");
			customers.add(gumusCustomer);
			
			AltinCustomer altinCustomer =  new AltinCustomer("mehmet", "yayciouglu", 48, "mehmet", "1234");
			altinCustomer.setAccountAmount(EAccountType.TL, 2000, "Mehmet TL account");
			altinCustomer.setAccountAmount(EAccountType.DOLAR, 1000, "Mehmet DOLAR account");
			customers.add(altinCustomer);

			PlatinyumCustomer platCustomer =  new PlatinyumCustomer("ali", "yayciouglu", 48, "ali", "1234");
			platCustomer.setAccountAmount(EAccountType.TL, 2000, "Ali TL account");
			platCustomer.setAccountAmount(EAccountType.DOLAR, 1000, "Ali DOLAR account");
			platCustomer.setAccountAmount(EAccountType.EURO, 1500, "Ali EURO account");
			customers.add(platCustomer);
			
			customerList.setCustomers(customers);
			
			createMarshaller.marshal(customerList, fileOutputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
