package com.capstone.capstonebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.capstonebackend.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,String> {

}
