package com.nhnacademy.springbootjpaday2.repository;

import com.nhnacademy.springbootjpaday1.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository implements JpaRepository<Order, Long> {
}
