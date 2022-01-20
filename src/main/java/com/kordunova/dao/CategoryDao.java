package com.kordunova.dao;

import com.kordunova.dmo.Category;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class CategoryDao {
    @PersistenceContext
    EntityManager entityManager;

    public void save(Category category){
        entityManager.persist(category);
    }
}
