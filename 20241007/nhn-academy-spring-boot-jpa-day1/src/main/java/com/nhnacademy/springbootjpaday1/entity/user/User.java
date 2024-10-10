package com.nhnacademy.springbootjpaday1.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @NotNull
    @Size(max = 50)
    private String userName;

    @NotNull
    @Size(max = 200)
    private String userPassword;

    @NotNull
    @Size(max = 8)
    private String userBirth;

    @NotNull
    @Size(max = 10)
    private String userAuth;

    @NotNull
    private int userPoint;

    @CreatedDate
    private LocalDateTime createAt;

    @LastModifiedDate
    private LocalDateTime latestLoginAt;

}
