package com.yapikredi.training.collentions.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.yapikredi.training.collentions.StringUtils;
import com.yapikredi.training.java.Customer;

public class CustomerList {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			Customer customer = new Customer("osman" + StringUtils.addDigits(i, 3), "Yay" + StringUtils.addDigits(i, 3),
					100 * i);
			customer.setAge(random.nextInt(100));

			customers.add(customer);
		}

		Collections.sort(customers, new CustomerAgeComparator());

		for (Customer customer : customers) {
			System.out.println(customer);
		}

		System.out.println("-----------------------------------");
		Collections.sort(customers, new CustomerNameComparator());

		for (Customer customer : customers) {
			System.out.println(customer);
		}

	}
}
