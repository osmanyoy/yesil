package com.jpa.training.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.jpa.training.jpa.leftovers.Person;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PersonDAO {

	@PersistenceContext(unitName = "JPATraining")
	private EntityManager em;

	// @Transactional(rollbackOn = { IllegalStateException.class },
	// dontRollbackOn = { IllegalAccessError.class })
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void save(final Person person) {
		this.em.persist(person);
	}
}
