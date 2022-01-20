package com.kordunova.service;

import com.kordunova.dao.CartDao;
import com.kordunova.dmo.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CartService {

    @Autowired
    private CartDao cartDao;

    @Transactional
    public void save(Cart cart){
        cartDao.save(cart);
    }
}
