package com.yapikredi.training.collentions.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.yapikredi.training.collentions.Person;

public class MapMain {
	
	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<>();
		
		Person person = new Person();
		person.setName("osman1");
		person.setSurname("Surname");
		person.setPhone("0543502");
		person.setAge(48);
		
		// Map e ekleme
		map.put("osman1", person);
		// Map e ekleme
		map.put("osman2", person);
		// Map e ekleme
		map.put("osman3", person);
		
		person = new Person();
		person.setName("osman5");
		person.setSurname("Surname5");
		person.setPhone("0543502");
		person.setAge(48);
		
		// Map e ekleme
		map.put("osman5", person);
		
		
		// Map den alma
		Person person2 = map.get("osman5");
		System.out.println(person2);
		
		// Yontem 1
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			Person person3 = map.get(string);
			System.out.println(person3);
		}
		
		// Yontem 2
		Collection<Person> values = map.values();
		for (Person person3 : values) {
			System.out.println(person3);
		}
		
		// Yontem 3
		Set<Entry<String, Person>> entrySet = map.entrySet();
		for (Entry<String, Person> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		
	}
	
}
