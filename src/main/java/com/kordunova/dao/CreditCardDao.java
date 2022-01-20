package com.kordunova.dao;


import com.kordunova.dmo.CreditCard;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class CreditCardDao {
    @PersistenceContext
    EntityManager entityManager;

    public void save(CreditCard creditCard){
        entityManager.persist(creditCard);
    }
}
