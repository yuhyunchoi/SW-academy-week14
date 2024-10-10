package com.nhnacademy.springbootjpaday1.entity.cart;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Cart {
    @Id
    private long cart;

    private long productKey;

    private int quantity;
}

