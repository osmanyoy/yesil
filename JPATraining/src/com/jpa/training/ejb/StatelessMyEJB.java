package com.jpa.training.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.jpa.training.rest.MyFirstEntity;

@Stateless
@LocalBean
public class StatelessMyEJB {

	@PersistenceContext(unitName = "JPATraining")
	private EntityManager em;

	public void save(final MyFirstEntity firstEntity) {
		this.em.persist(firstEntity);
		this.em.flush();
		firstEntity.setValue1("osman test");
	}

	public void update(final MyFirstEntity firstEntity) {
		MyFirstEntity merge = this.em.merge(firstEntity);
		merge.setValue1("sdjsdkjf");
		// this.em.refresh(merge);
		// merge.setValue1("osman test");
	}

	public void delete(final MyFirstEntity firstEntity) {
		this.em.remove(firstEntity);

	}

	public MyFirstEntity find(final long id) {
		MyFirstEntity find = this.em.find(	MyFirstEntity.class,
											id);
		return find;
	}

	public List<MyFirstEntity> getAll() {
		TypedQuery<MyFirstEntity> createQuery = this.em.createQuery("select m from MyFirstEntity m",
																	MyFirstEntity.class);
		return createQuery.getResultList();
	}

}
