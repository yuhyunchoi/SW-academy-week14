package com.nhnacademy.springbootjpaday2.repository;

import com.nhnacademy.springbootjpaday1.entity.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository implements JpaRepository<Category, Long> {
}
