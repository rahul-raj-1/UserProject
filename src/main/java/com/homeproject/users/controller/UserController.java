package com.homeproject.users.controller;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.homeproject.users.dto.CountryDto;
import com.homeproject.users.service.CustomerService;

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
	@RequestMapping("country")
	public ResponseEntity<?> getAllStates() {
	
		 
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl  = "http://services.groupkt.com/country/get/all";
		
		
		 Response response = restTemplate
				 .getForObject( fooResourceUrl, Response.class); 
		 

		 System.out.println(" response.toString()  --------> "   +  response.toString());
		 return ResponseEntity.ok(response.toString());
	}




	
	
	
}
