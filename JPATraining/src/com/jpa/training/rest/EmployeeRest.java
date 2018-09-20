package com.jpa.training.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jpa.training.ejb.DepartmentDAO;
import com.jpa.training.ejb.EmployeeDAO;

@Path("/employee")
public class EmployeeRest {

	@EJB
	private EmployeeDAO empDAO;

	@EJB
	private DepartmentDAO depDAO;

	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee() {

		Employee employee = new Employee();
		employee.setName("osman");
		employee.setSurname("yay");
		List<Address> addresses = new ArrayList<>();
		Address address = new Address();
		address.setCity("istanbul");
		address.setStreet("ataþehir");
		addresses.add(address);

		address = new Address();
		address.setCity("istanbul");
		address.setStreet("ümraniye");
		addresses.add(address);

		employee.setAddresses(addresses);

		List<String> departments = new ArrayList<>();
		departments.add("IT");
		departments.add("SALES");
		employee.setDepartmentNames(departments);

		// this.empDAO.save(employee);

		Map<String, Tasks> map = new HashMap<>();
		Tasks tasks = new Tasks();
		tasks.setTaskName("task1");
		tasks.setTaskDesc("Java Training 1");
		tasks.setTaskDate(new Date());
		map.put(tasks.getTaskName(),
				tasks);

		tasks = new Tasks();
		tasks.setTaskName("task2");
		tasks.setTaskDesc("Java Training 2");
		tasks.setTaskDate(new Date());
		map.put(tasks.getTaskName(),
				tasks);

		tasks = new Tasks();
		tasks.setTaskName("task3");
		tasks.setTaskDesc("Java Training 3");
		tasks.setTaskDate(new Date());
		map.put(tasks.getTaskName(),
				tasks);

		employee.setTasks(map);

		return employee;
	}

	@Path("/add")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee addEmployee(final Employee employee) {
		List<String> departmentNames = employee.getDepartmentNames();
		for (String depName : departmentNames) {
			Department department = this.depDAO.getDepWithName(depName);
			if (department != null) {
				employee.addDepartment(department);
			} else {
				Department dep = new Department();
				dep.setDepName(depName);
				dep.setDepDesc(depName);
				this.depDAO.save(dep);
				employee.addDepartment(dep);
			}
		}
		List<Address> addresses = employee.getAddresses();
		for (Address address : addresses) {
			address.setEmployee(employee);
		}
		this.empDAO.save(employee);
		return employee;
	}

	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		List<Employee> all = this.empDAO.getAll();
		List<Employee> filledEmployees = new ArrayList<>();
		for (Employee employee : all) {
			Employee fillEmployee = this.empDAO.fillAddress(employee);
			List<Department> departments = fillEmployee.getDepartments();
			if (departments != null) {
				List<String> depNames = new ArrayList<>();
				for (Department department : departments) {
					depNames.add(department.getDepName());
				}
				fillEmployee.setDepartmentNames(depNames);
			}
			filledEmployees.add(fillEmployee);
		}
		return filledEmployees;
	}

}
