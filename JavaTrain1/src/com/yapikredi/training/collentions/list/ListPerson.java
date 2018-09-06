package com.yapikredi.training.collentions.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.yapikredi.training.collentions.Person;

public class ListPerson {
	
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			Person person = new Person();
			person.setName("Person" + i);
			person.setSurname("Surname" + i);
			person.setPhone("0543502" + random.nextInt(1_000_000));
			person.setAge(random.nextInt(100));
			personList.add(person);
		}
		
		for (Person person : personList) {
			System.out.println(person);
		}
		
		System.out.println("-------------------------------------------------");
		
		Collections.sort(personList);
		
		
		for (Person person : personList) {
			System.out.println(person);
		}
		
		System.out.println("-------------------------------------------------");

		PersonPhoneComparator ppc =  new PersonPhoneComparator();
		Collections.sort(personList,ppc);
		
		for (Person person : personList) {
			System.out.println(person);
		}
		
	}
	
}
