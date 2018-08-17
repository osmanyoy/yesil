package com.metod.java.training.projects.customer.dao;

public class CustomerDAOFactory {

    public static ICustomerDAO getCustomerDAO() {
        String property = System.getProperties()
                                .getProperty("customer.dao.type");
        switch (property) {
        case "random":
            return new CustomerRandomDAO();
        case "xml":
            return new CustomerXMLDAO();

        default:
            return new CustomerRandomDAO();
        }

    }

}
