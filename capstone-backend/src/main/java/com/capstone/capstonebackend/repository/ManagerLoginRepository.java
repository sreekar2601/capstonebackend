package com.capstone.capstonebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.capstonebackend.model.ManagerLogin;

@Repository
public interface ManagerLoginRepository extends JpaRepository<ManagerLogin,String>{

	ManagerLogin findByusername(String username);
	
	

}
