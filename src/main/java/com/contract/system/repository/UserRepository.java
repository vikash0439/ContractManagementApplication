package com.contract.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contract.system.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
