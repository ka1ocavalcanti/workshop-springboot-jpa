package com.kaioweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaioweb.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
