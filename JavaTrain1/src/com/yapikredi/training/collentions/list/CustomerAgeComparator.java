package com.yapikredi.training.collentions.list;

import java.util.Comparator;

import com.yapikredi.training.java.Customer;

public class CustomerAgeComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getAge() - o2.getAge();
	}

}
