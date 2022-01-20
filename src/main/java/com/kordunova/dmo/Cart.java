package com.kordunova.dmo;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "id_number", nullable = false)
    private int cartNumber;

    public Cart() {
    }

    public Cart(int cartNumber) {
        this.cartNumber = cartNumber;
    }
}
