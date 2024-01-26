package com.kaioweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaioweb.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
