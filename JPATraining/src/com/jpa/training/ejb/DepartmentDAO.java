package com.jpa.training.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.jpa.training.rest.Department;

@Stateless
@LocalBean
public class DepartmentDAO {

	@PersistenceContext(unitName = "JPATraining")
	private EntityManager em;

	public void save(final Department dep) {
		this.em.persist(dep);
	}

	public Department getDepWithName(final String depName) {
		TypedQuery<Department> createQuery = this.em.createQuery(	"select d from Department d where d.depName = :dep_name",
																	Department.class);
		createQuery.setParameter(	"dep_name",
									depName);
		List<Department> resultList = createQuery.getResultList();
		if ((resultList != null) && (resultList.size() > 0)) {
			return resultList.get(0);
		}
		return null;
	}

}
