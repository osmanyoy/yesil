package com.yapikredi.java.dp.project.customer.dao;

public class CustomerDAOFactory {
	public static ICustomerDAO createCustomerDAO() {
		String property = System.getProperty("com.project.dao.type");
		switch (property) {
		case "man":
			return new CustomerManualDAO();
		case "xml":
			return new CustomerXMLDAO();

		default:
			return new CustomerManualDAO();
		}

	}
}
