package com.LucasGabriel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LucasGabriel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
