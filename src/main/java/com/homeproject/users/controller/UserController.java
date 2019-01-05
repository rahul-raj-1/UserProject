package com.homeproject.users.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.homeproject.users.dto.CountryDto;
import com.homeproject.users.service.CustomerService;
import com.homeproject.users.util.Response;

@RestController
public class UserController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("/UserPage")
	public ResponseEntity<?> getUsersList() {
	
		 
		 return ResponseEntity.ok(customerService.getCustomerList());
	}
	

	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("countryCodes")
	public ResponseEntity<?> getAllStates() {
	
   return ResponseEntity.ok( customerService.getCountryCodes());
		 
		 
	}




	
	
	
}
