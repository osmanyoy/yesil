package com.jpa.training.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.jpa.training.rest.Address;
import com.jpa.training.rest.Employee;

@Stateless
@LocalBean
public class EmployeeDAO {

	@PersistenceContext(unitName = "JPATraining")
	private EntityManager em;

	public void save(final Employee emp) {
		this.em.persist(emp);
	}

	public List<Employee> getAll() {
		TypedQuery<Employee> createQuery = this.em.createQuery(	"select e from Employee e",
																Employee.class);
		return createQuery.getResultList();
	}

	public Employee fillAddress(final Employee emp) {
		Employee merge = emp;
		if (!this.em.contains(emp)) {
			merge = this.em.merge(emp);
		}
		List<Address> addresses = merge.getAddresses();
		System.out.println(addresses);
		return merge;
	}
}
