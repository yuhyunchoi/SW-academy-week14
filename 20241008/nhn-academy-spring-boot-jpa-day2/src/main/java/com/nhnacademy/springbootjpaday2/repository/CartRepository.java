package com.nhnacademy.springbootjpaday2.repository;

import com.nhnacademy.springbootjpaday1.entity.cart.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository implements JpaRepository<Cart, Long> {
}
