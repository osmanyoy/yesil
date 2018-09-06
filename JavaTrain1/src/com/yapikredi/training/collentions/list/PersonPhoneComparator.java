package com.yapikredi.training.collentions.list;

import java.util.Comparator;

import com.yapikredi.training.collentions.Person;

public class PersonPhoneComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getPhone().compareTo(o2.getPhone());
	}

}
