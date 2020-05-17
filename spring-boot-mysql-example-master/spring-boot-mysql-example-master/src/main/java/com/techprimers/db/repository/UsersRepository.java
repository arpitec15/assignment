package com.techprimers.db.repository;

import com.techprimers.db.model.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	Users findById(Integer id);
}
