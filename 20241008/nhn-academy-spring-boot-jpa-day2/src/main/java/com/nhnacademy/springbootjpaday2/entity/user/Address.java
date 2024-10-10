package com.nhnacademy.springbootjpaday2.entity.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Entity
@Getter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressKey;

    private long userId;

    @NotNull
    @Size(max = 100)
    private String userAddress;

    @ManyToOne
    private User user;

}
