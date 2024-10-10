package com.nhnacademy.springbootjpaday2.entity.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import lombok.Getter;

@Entity
@Getter
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pointKey;

    private long userId;

    private int everydayPointAdd;

    @OneToOne
    private User user;
}
