package com.yapikredi.training.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.yapikredi.training.collentions.Person;

@WebService(targetNamespace="http://train.yapi.com")
public class PersonWS {

	public Person getPerson(@WebParam(name="name") String name) {
		Person person = new Person();
		person.setName(name);
		person.setPhone("832747832");
		person.setAge(45);
		person.setSurname("sur");
		return person;
	}
}
