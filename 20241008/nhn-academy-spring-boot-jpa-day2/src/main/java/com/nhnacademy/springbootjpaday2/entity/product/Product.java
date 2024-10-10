package com.nhnacademy.springbootjpaday2.entity.product;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Entity
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productKey;

    @NotNull
    @Size(max = 50)
    private String productName;

    @NotNull
    private int productPrice;

    @NotNull
    private String thumbnailImage;

    @NotNull
    private String detailImage;
}
