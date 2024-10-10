package com.nhnacademy.springbootjpaday2.entity.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
public class PointUse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pointKey;

    @NotNull
    private LocalDateTime useDate;

    @OneToOne
    private Point point;
}
