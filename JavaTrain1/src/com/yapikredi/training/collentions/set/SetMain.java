package com.yapikredi.training.collentions.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.yapikredi.training.collentions.Person;

public class SetMain {
	public static void main(String[] args) {
		Set<String> strSet = new TreeSet<>();
		
		
		strSet.add("osman1");
		strSet.add("osman1");
		strSet.add("osman1");
		strSet.add("osman1");
		strSet.add("osman1");
		strSet.add("osman2");
		strSet.add("osman3");
		strSet.add("osman4");
		strSet.add("osman5");
		strSet.add("osman6");
		strSet.add("osman7");
		strSet.add("osman8");
		
		for (String string : strSet) {
			System.out.println(string);
		}

		Set<String> strSet2 = new TreeSet<>();
		strSet2.add("osman4");
		strSet2.add("osman5");
		strSet2.add("osman6");
		strSet2.add("osman7");
		strSet2.add("osman8");
		strSet2.add("osman9");
		strSet2.add("osman10");
		strSet2.add("osman11");
		strSet2.add("osman12");
		strSet2.add("osman13");
		strSet2.add("osman14");
		strSet2.add("osman15");
		
		strSet.addAll(strSet2);
		
		for (String string : strSet) {
			System.out.println(string);
		}
		strSet.contains("osman7");
		
		Set<Person> personSet = new HashSet<>();

		Person person = new Person();
		person.setName("Person");
		person.setSurname("Surname");
		person.setPhone("0543502");
		person.setAge(48);
		
		personSet.add(person);

		Person person1 = new Person();
		person1.setName("Person");
		person1.setSurname("Surname");
		person1.setPhone("0543502");
		person1.setAge(48);

		personSet.add(person1);
		
		for (Person person2 : personSet) {
			System.out.println(person2);
		}
	
	}
}
