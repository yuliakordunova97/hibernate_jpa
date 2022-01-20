package com.kordunova;

import com.kordunova.config.ApplicationConfigurationClass;
import com.kordunova.dmo.Cart;
import com.kordunova.dmo.Product;
import com.kordunova.service.CartService;
import com.kordunova.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfigurationClass.class);
        ProductService productService = context.getBean(ProductService.class);
        CartService cartService = context.getBean(CartService.class);

        Cart cart = new Cart(1);
        cartService.save(cart);

        Product product = new Product("Mashroom", 1, cart);
        productService.save(new Product("Bread", 2, cart));
        productService.save(new Product("Shampoo", 3, cart));
        productService.save(new Product("MobilePhone", 1, cart));
        productService.save(new Product("Bread", 1, cart));


        productService.save(product);
        productService.getProduct(5);
        productService.update(product);
        productService.deleteProduct(4);

        List<Product> productList = productService.getAll();
        for (Product p: productList){
            System.out.println(p);
        }

         context.close();
    }
}
