package com.nhnacademy.springbootjpaday2.entity.order;

import com.nhnacademy.springbootjpaday1.entity.product.Product;
import com.nhnacademy.springbootjpaday1.entity.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.ZonedDateTime;

@Entity
@Getter
public class Order {
    @Id
    private long orderId;

    private long userid;

    @NotNull
    private ZonedDateTime orderTime;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Product product;



}
