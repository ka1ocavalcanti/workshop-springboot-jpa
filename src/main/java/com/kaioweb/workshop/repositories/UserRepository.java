package com.kaioweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaioweb.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
