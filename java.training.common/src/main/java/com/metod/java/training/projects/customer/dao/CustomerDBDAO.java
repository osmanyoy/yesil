package com.metod.java.training.projects.customer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CustomerDBDAO implements ICustomerDAO {

    private EntityManagerFactory createEntityManagerFactory;

    public CustomerDBDAO() {
        this.createEntityManagerFactory = Persistence.createEntityManagerFactory("java.training.common");
    }

    @Override
    public List<Customer> getAllCustomers() {
        EntityManager createEntityManager = this.createEntityManagerFactory.createEntityManager();
        TypedQuery<Customer> createQuery = createEntityManager.createQuery("select c Customer c", Customer.class);
        List<Customer> resultList = createQuery.getResultList();
        return resultList;
    }

    @Override
    public void addCustomer(final Customer customer) {
        EntityManager createEntityManager = this.createEntityManagerFactory.createEntityManager();
        try {
            createEntityManager.getTransaction()
                               .begin();

            createEntityManager.persist(customer);

            createEntityManager.getTransaction()
                               .commit();
        } catch (Exception e) {
            createEntityManager.getTransaction()
                               .rollback();
            e.printStackTrace();
        } finally {
            if (createEntityManager != null) {
                createEntityManager.close();
            }
        }
    }

}
