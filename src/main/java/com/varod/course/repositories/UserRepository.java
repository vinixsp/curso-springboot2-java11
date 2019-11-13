package com.varod.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varod.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
