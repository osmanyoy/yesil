package com.yapikredi.training.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.yapikredi.training.collentions.Person;

public class XMLMain {
	
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(PersonList.class);
			List<Person> persons = new ArrayList<>();
			Person person = new Person();
			person.setAge(48);
			person.setName("Osman");
			person.setPhone("0434634443");
			person.setSurname("yaycioglu");
			persons.add(person);
			person = new Person();
			person.setAge(30);
			person.setName("mehmet");
			person.setPhone("0434634444");
			person.setSurname("yaycioglu3");
			persons.add(person);
			PersonList personList = new PersonList();
			personList.setPersons(persons);
			File file = new File("person.xml");
			Marshaller createMarshaller = context.createMarshaller();
			FileOutputStream outputStream = new FileOutputStream(file);
			createMarshaller.marshal(personList, outputStream);
			
			// Okuma
			Unmarshaller createUnmarshaller = context.createUnmarshaller();
			FileInputStream fileInputStream = new FileInputStream(file);
			PersonList unmarshal = (PersonList)createUnmarshaller.unmarshal(fileInputStream);
			
			System.out.println(unmarshal.getPersons());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
