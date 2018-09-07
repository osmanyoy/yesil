package com.yapikredi.training.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.yapikredi.training.collentions.Person;

@XmlRootElement
public class PersonList {
	private List<Person> persons;

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	
}
