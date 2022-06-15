package com.capstone.capstonebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.capstonebackend.model.Customer;

import com.capstone.capstonebackend.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerrepo;
	
	
	@GetMapping("/getcustomers")
	public List<Customer> getAllcustomers(){
		return customerrepo.findAll();
	}
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerrepo.save(customer);
	}

}
