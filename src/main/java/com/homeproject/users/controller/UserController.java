package com.homeproject.users.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.homeproject.users.service.UserServiceImpl;

@RestController

public class UserController {
	
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("/UserPage")
	public ResponseEntity<?> getUsersList() {
	
		 
		 return ResponseEntity.ok(userService.getUsersList());
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("/UserUpdate")
	public ResponseEntity<?> updateUsers() {
		
		List<Long> userIds= new ArrayList<Long>();
		
		
		userIds.add(100L);
		
		userService.updateUsers(userIds);		
		
		 return ResponseEntity.ok(200);
	}
	
	
}
