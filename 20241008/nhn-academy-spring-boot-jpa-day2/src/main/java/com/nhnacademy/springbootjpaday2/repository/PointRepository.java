package com.nhnacademy.springbootjpaday2.repository;

import com.nhnacademy.springbootjpaday1.entity.user.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository implements JpaRepository<Point, Long> {
}
