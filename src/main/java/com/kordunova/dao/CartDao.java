package com.kordunova.dao;


import com.kordunova.dmo.Cart;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class CartDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Cart cart){
        entityManager.persist(cart);
        flushAndClear();
    }

    void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }
}
