package com.kaioweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaioweb.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
