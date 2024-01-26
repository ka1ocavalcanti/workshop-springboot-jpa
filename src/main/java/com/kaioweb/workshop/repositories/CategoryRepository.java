package com.kaioweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaioweb.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
