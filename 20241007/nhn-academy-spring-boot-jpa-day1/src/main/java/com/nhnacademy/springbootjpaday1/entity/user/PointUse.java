package com.nhnacademy.springbootjpaday1.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
