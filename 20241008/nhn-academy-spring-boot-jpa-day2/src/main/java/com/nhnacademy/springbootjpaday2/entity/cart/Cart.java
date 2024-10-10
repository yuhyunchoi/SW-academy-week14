package com.nhnacademy.springbootjpaday2.entity.cart;

import com.nhnacademy.springbootjpaday1.entity.product.Product;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Cart {
    @Id
    private long cartId;

    private long productKey;

    private int quantity;

    @OneToOne
    @MapsId
    private Product product;

}

