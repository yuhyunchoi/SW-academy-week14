package com.nhnacademy.springbootjpaday2.entity.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class PointAccumulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pointKey;

    @NotNull
    private LocalDateTime accumulatedDate;

    @OneToOne
    private Point point;
}
