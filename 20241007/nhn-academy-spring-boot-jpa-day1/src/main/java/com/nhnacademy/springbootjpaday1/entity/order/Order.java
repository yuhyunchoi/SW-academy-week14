package com.nhnacademy.springbootjpaday1.entity.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

}
