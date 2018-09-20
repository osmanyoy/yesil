package com.jpa.training.jpa.leftovers;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.jpa.training.ejb.PersonDAO;

@Path("/person")
public class PersonRest {

	@EJB
	private PersonDAO personDAO;

	@GET
	@Path("/insert/hw")
	public void writeHW() {
		HouseWife houseWife = new HouseWife();
		houseWife.setAddress("adress");
		houseWife.setName("Nil");
		houseWife.setSurname("yaay");
		this.personDAO.save(houseWife);

	}

	@GET
	@Path("/insert/st")
	public void writeST() {
		Student student = new Student();
		student.setName("NehirSu");
		student.setSurname("yaay");
		student.setStudentNo("870900013");
		this.personDAO.save(student);

	}

}
