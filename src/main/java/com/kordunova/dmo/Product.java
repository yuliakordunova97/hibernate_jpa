package com.kordunova.dmo;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartId", referencedColumnName = "id_number")
    private Cart cart;

    @ManyToMany(mappedBy = "products")
    private Set<Category> categories = new HashSet<>();

    public Product() {
    }

    public Product(String name, int amount, Cart cart) {
        this.name = name;
        this.amount = amount;
        this.cart = cart;
    }
}
