package com.jpa.training.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

/**
 * Session Bean implementation class Xyz
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
@LocalBean
public class Xyz {

    /**
     * Default constructor. 
     */
    public Xyz() {
        // TODO Auto-generated constructor stub
    }
    
    @Transactional(value=TxType.REQUIRES_NEW)
    public void metod() {
    	
    }

}
