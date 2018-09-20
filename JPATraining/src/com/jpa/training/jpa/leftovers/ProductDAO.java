package com.jpa.training.jpa.leftovers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
public class ProductDAO {

	@PersistenceContext(unitName = "JPATraining")
	private EntityManager em;

	public void save(final Product product) {
		this.em.persist(product);
	}

	public void update(final Product product) {
		Product find = this.em.find(Product.class,
		                            product.getProdId(),
		                            LockModeType.PESSIMISTIC_WRITE);
		find.setProductType(product.getProductType());
		// this.em.lock(merge,
		// LockModeType.OP);
	}

	public List<Product> getall() {
		TypedQuery<Product> createQuery = this.em.createQuery("select p from Product p",
		                                                      Product.class);
		return createQuery.getResultList();
	}

	public List<Product> getProducts(final String pName) {
		TypedQuery<Product> createNamedQuery = this.em.createNamedQuery("Product.getByProductName",
		                                                                Product.class);
		createNamedQuery.setParameter(1,
		                              pName);
		return createNamedQuery.getResultList();
	}

	public List<Product> getNativeProducts(final String pName) {
		Query createNativeQuery = this.em.createNativeQuery("select * from product",
		                                                    Product.class);
		return createNativeQuery.getResultList();
	}

	public List<Product> getNativeProducts2(final String pName) {
		Query createNamedQuery = this.em.createNamedQuery("Product.native.getByProductName");
		return createNamedQuery.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Product> getNativeProducts3(final String pName) {
		Query createNamedQuery = this.em.createNativeQuery("select p.prodId,p.productName as pn,p.endDate as ed,p.productType as pt,p.productVersion as pv, p.versionInfo as vi from product p where productName=:pName",
		                                                   "customMap1");
		createNamedQuery.setParameter("pName",
		                              pName);
		return createNamedQuery.getResultList();
	}

}
