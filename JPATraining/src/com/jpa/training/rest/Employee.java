package com.jpa.training.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long empId;

	private String name;
	private String surname;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee")
	private List<Address> addresses;

	@XmlTransient
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.EAGER)
	private List<Department> departments;

	@Transient
	private List<String> departmentNames;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	// @MapKey(name = "taskName")
	@MapKeyColumn(unique = true)
	private Map<String, Tasks> tasks;

	public void addDepartment(final Department department) {
		if (this.departments == null) {
			this.departments = new ArrayList<>();
		}
		this.departments.add(department);
	}

	public long getEmpId() {
		return this.empId;
	}

	public void setEmpId(final long empId) {
		this.empId = empId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(final List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(final List<Department> departments) {
		this.departments = departments;
	}

	public List<String> getDepartmentNames() {
		return this.departmentNames;
	}

	public void setDepartmentNames(final List<String> departmentNames) {
		this.departmentNames = departmentNames;
	}

	public Map<String, Tasks> getTasks() {
		return this.tasks;
	}

	public void setTasks(final Map<String, Tasks> tasks) {
		this.tasks = tasks;
	}

}
