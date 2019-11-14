package com.varod.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varod.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
