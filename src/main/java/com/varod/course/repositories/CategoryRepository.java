package com.varod.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varod.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
