package com.nhnacademy.springbootjpaday2.repository;

import com.nhnacademy.springbootjpaday1.entity.user.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository implements JpaRepository<Address, Long> {
}
