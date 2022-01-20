package com.kordunova.service;

import com.kordunova.dao.ProductDao;
import com.kordunova.dmo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    private ProductDao productDao;

    @Transactional
    public void save(Product product){
        productDao.save(product);
    }

    @Transactional
    public void update(Product product){
        productDao.update(product);
    }


    @Transactional(readOnly = true)
    public List<Product> getAll(){
        return productDao.getAll();
    }

    @Transactional
    public Product getProduct(long id){return productDao.getProduct(id);}

    @Transactional
    public void deleteProduct(long id){ productDao.deleteProduct(id);}


}
