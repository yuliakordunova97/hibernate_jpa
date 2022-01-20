package com.kordunova.dmo;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String type;

    @ManyToMany
    @JoinTable(name = "category_products",
    joinColumns = {@JoinColumn(name = "category_id")},
    inverseJoinColumns = {@JoinColumn(name = "product_id")})
    Set<Product> products = new HashSet<>();

    public Category() {
    }

    public Category(String type) {
        this.type = type;
    }
}
