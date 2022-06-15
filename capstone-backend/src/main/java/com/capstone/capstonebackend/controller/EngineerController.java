package com.capstone.capstonebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.capstonebackend.exception.ResourceNotFoundException;
import com.capstone.capstonebackend.model.Customer;
import com.capstone.capstonebackend.model.CustomerComplaint;
import com.capstone.capstonebackend.model.Engineer;
import com.capstone.capstonebackend.repository.CustomerComplaintRepository;
import com.capstone.capstonebackend.repository.CustomerRepository;
import com.capstone.capstonebackend.repository.EngineerRepository;

@RestController
@RequestMapping("/engineer")
@CrossOrigin(origins = "http://localhost:4200")
public class EngineerController {

	@Autowired
	private EngineerRepository engineerrepo;
	@Autowired 
	private CustomerComplaintRepository repo;
	@Autowired
	private CustomerRepository repocustomer;
	
	@GetMapping("/getengineers")
	public List<Engineer> getAllengineers(){
		return engineerrepo.findAll();
	}
	@PostMapping("/engineers")
	public Engineer createEngineer(@RequestBody Engineer engineer) {
		return engineerrepo.save(engineer);
	}
	@GetMapping("/status")
	public List<CustomerComplaint> getcomplaints(){
		return repo.findAll();
	}
	@PutMapping("/update/{name}")
	public ResponseEntity<Customer> updatecustomer(@PathVariable String name,@RequestBody Customer customer){
		Customer cus=repocustomer.findById(name).orElseThrow(()->new ResourceNotFoundException("customer does not exist"+name));
		cus.setStatus(customer.getStatus());
		Customer updatedcustomer=repocustomer.save(cus);
		return ResponseEntity.ok(updatedcustomer);
	}
	
}
