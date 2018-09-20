package com.jpa.training.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class Yyz
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class Yyz {

    /**
     * Default constructor. 
     */
    public Yyz() {
        // TODO Auto-generated constructor stub
    }

}
