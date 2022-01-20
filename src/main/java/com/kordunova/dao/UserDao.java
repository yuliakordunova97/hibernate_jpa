package com.kordunova.dao;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;

    public void save(UserDao userDao){
        entityManager.persist(userDao);
    }
}
