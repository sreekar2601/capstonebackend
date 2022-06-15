package com.capstone.capstonebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.capstonebackend.model.Engineer;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer,String> {

}
