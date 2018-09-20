package com.jpa.training.rest;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jpa.training.ejb.StatelessMyEJB;

@Path("/first")
@SessionScoped
public class MyFirstRest implements Serializable {

	public MyFirstRest() {
		System.out.println("MyFirst");
	}

	@EJB
	private StatelessMyEJB sme;

	@GET
	// @Transactional
	public String hello() {
		MyFirstEntity myFirstEntity = new MyFirstEntity();
		myFirstEntity.setValue1("val1");
		myFirstEntity.setValue2("val2");
		myFirstEntity.setValue3(3);
		myFirstEntity.setTestMest("test mest str");

		MySecondEntity mySecondEntity1 = new MySecondEntity("osman",
															"password");

		MySecondEntity mySecondEntity2 = MySecondEntity.createObjeType1("osman",
																		"password");

		MySecondEntity mySecondEntity3 = MySecondEntity	.getBuilder()
														.setUsername("osman")
														.setPassword("password")
														.createObjeType1();

		myFirstEntity.setMySecondEntity(mySecondEntity3);
		MyThirdEntity myThirdEntity = new MyThirdEntity("s1",
														"s2",
														"s3");

		myThirdEntity.setMyFirstEntity(myFirstEntity);

		myFirstEntity.setMyThirdEntity(myThirdEntity);

		this.sme.save(myFirstEntity);
		return "hello";
	}

	@GET
	@Path("/prototype")
	@Produces(MediaType.APPLICATION_JSON)
	public MyFirstEntity prototype() {
		MyFirstEntity myFirstEntity = new MyFirstEntity();
		myFirstEntity.setValue1("val1");
		myFirstEntity.setValue2("val2");
		myFirstEntity.setValue3(3);
		myFirstEntity.setTestMest("test mest str");

		MySecondEntity mySecondEntity1 = new MySecondEntity("osman",
															"password");

		MySecondEntity mySecondEntity2 = MySecondEntity.createObjeType1("osman",
																		"password");

		MySecondEntity mySecondEntity3 = MySecondEntity	.getBuilder()
														.setUsername("osman")
														.setPassword("password")
														.createObjeType1();

		myFirstEntity.setMySecondEntity(mySecondEntity3);
		MyThirdEntity myThirdEntity = new MyThirdEntity("s1",
														"s2",
														"s3");

		myThirdEntity.setMyFirstEntity(myFirstEntity);

		myFirstEntity.setMyThirdEntity(myThirdEntity);

		return myFirstEntity;
	}

	@GET
	@Path("/update")
	public String update() {
		MyFirstEntity myFirstEntity = new MyFirstEntity();
		myFirstEntity.setMfeId(2);
		myFirstEntity.setValue1("val1");
		myFirstEntity.setValue2("val2");
		myFirstEntity.setValue3(3);
		this.sme.update(myFirstEntity);
		return "hello";
	}

	@POST
	@Path("/insert")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public MyFirstEntity insertMyFirstEntity(final MyFirstEntity myFirstEntity) {
		myFirstEntity	.getMyThirdEntity()
						.setMyFirstEntity(myFirstEntity);
		this.sme.save(myFirstEntity);
		return myFirstEntity;

	}

	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public MyFirstEntity updateMyFirstEntity(final MyFirstEntity myFirstEntity) {
		myFirstEntity	.getMyThirdEntity()
						.setMyFirstEntity(myFirstEntity);
		this.sme.update(myFirstEntity);
		return myFirstEntity;

	}

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MyFirstEntity> getAll() {
		return this.sme.getAll();
	}

}
