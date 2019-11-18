package com.varod.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varod.course.entities.OrderItem;
import com.varod.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
