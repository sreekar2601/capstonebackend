package com.capstone.capstonebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.capstonebackend.model.CustomerLogin;
import com.capstone.capstonebackend.model.EngineerLogin;
import com.capstone.capstonebackend.repository.EngineerLoginRepository;

@RestController
@RequestMapping("/engineerlogin")
@CrossOrigin(origins = "http://localhost:4200")
public class EngineerLoginController {
	
	@Autowired
	private EngineerLoginRepository engineerlogin;
	
	@PostMapping("/login")
	public ResponseEntity<EngineerLogin> login(@RequestBody EngineerLogin engineerdata){
		EngineerLogin engineer=engineerlogin.findByusername(engineerdata.getUsername());
		if(engineer.getPassword().equals(engineerdata.getPassword()))
			return ResponseEntity.ok(engineer);
		return (ResponseEntity<EngineerLogin>) ResponseEntity.internalServerError();
	
	}

}
