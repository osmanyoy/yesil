package com.yapikredi.training.project.customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.yapikredi.training.java.Customer;

public class CustomerDAO {

	public List<Customer> getAllCustomers() {
		try {
			JAXBContext context = JAXBContext.newInstance(CustomerList.class);
			Unmarshaller unmar = context.createUnmarshaller();
			File file = new File("customer.xml");
			FileInputStream fileInStream = new FileInputStream(file);
			CustomerList customerList = (CustomerList) unmar.unmarshal(fileInStream);
			return customerList.getCustomers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
