package com.varod.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varod.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
