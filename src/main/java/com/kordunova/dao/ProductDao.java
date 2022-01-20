package com.kordunova.dao;


import com.kordunova.dmo.Product;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Product product){
        entityManager.persist(product);
        flushAndClear();
    }
    public void update(Product product){
        entityManager.merge(product);
        flushAndClear();
    }

    public Product getProduct(long id){
        return entityManager.find(Product.class,id);
    }

    public void deleteProduct(long id){
        Product product = entityManager.find(Product.class, id);
        entityManager.remove(product);
        flushAndClear();
    }



    public List<Product> getAll(){
        return entityManager.createQuery("select p from Product p").getResultList();
    }


    void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }
}
