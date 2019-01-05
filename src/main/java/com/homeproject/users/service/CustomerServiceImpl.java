package com.homeproject.users.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homeproject.users.dto.UserDto;
import com.homeproject.users.entity.Customer;

import com.homeproject.users.reporistory.CustomerRepository;


 

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	

	
	public List<Customer> getCustomerList() {
		
		List<Customer> customerList= customerRepository.findAll();
		
		return customerList;
		
		
	}




	

}
