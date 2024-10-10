package com.nhnacademy.springbootjpaday1.entity.product;

import com.nhnacademy.springbootjpaday1.entity.pk.CategoryPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Category {
    @EmbeddedId
    private CategoryPk pk;
}
