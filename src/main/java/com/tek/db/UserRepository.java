package com.tek.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tek.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}