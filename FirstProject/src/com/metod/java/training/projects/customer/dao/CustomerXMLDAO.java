package com.metod.java.training.projects.customer.dao;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.metod.java.training.projects.customer.Customer;
import com.metod.java.training.projects.customer.CustomerList;
import com.metod.java.training.projects.customer.ICustomerDAO;

public class CustomerXMLDAO implements ICustomerDAO {

    @Override
    public List<Customer> getAllCustomers() {
        try {
            JAXBContext newContext = JAXBContext.newInstance(CustomerList.class);
            Unmarshaller createUnmarshaller = newContext.createUnmarshaller();
            File file = new File("cust.xml");
            FileInputStream fileInputStream = new FileInputStream(file);
            CustomerList customerList2 = (CustomerList) createUnmarshaller.unmarshal(fileInputStream);
            if (customerList2 != null) {
                return customerList2.getCustomers();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
