package com.kordunova.dmo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "credit_card")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public CreditCard() {
    }
}
