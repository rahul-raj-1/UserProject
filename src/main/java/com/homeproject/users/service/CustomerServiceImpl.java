package com.homeproject.users.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.homeproject.users.dto.CountryDto;
import com.homeproject.users.dto.UserDto;
import com.homeproject.users.entity.Customer;

import com.homeproject.users.reporistory.CustomerRepository;
import com.homeproject.users.util.Response;


 

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	// create bean in Oracle Configuration
	@Autowired
    private RestTemplate restTemplate;
	
	
	public List<Customer> getCustomerList() {
		
		List<Customer> customerList= customerRepository.findAll();
		
		return customerList;
	
	}


   
	
public List<CountryDto> getCountryCodes() {
	
	String url  = "http://services.groupkt.com/country/get/all"; 
	
	HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
 ///   httpHeaders.set("Authorization", "Bearer " + "your token"); if autherisation was there 
    
    HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
		
    ResponseEntity<Response> responseResponseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, Response.class);
 //System.out.println("responseResponseEntity.getBody() --- "   +  responseResponseEntity.getBody().getRestResponse().getResults() );
		
// wew can use getForObject too 
// Response response = restTemplate.getForObject( fooResourceUrl, Response.class); 
// System.out.println(" response.toString()  --------> "   +  response.getRestResponse().getResults());

   
    
for (CountryDto countryDto : responseResponseEntity.getBody().getRestResponse().getResults()  )
{
	 
	System.out.println(  "Country Name : - "  + countryDto.getCountryName());
	System.out.println(  "Alpha 2 Code  : - "  + countryDto.getAlpha2Code());
	System.out.println(  "Alpha 3 Code : - "  + countryDto.getAlpha3Code() );
}
System.out.println( "Total no of object  ->  "  + responseResponseEntity.getBody().getRestResponse().getResults().size()   );
System.out.println("  responseResponseEntity.getHeaders() --" +  responseResponseEntity.getHeaders());
return responseResponseEntity.getBody().getRestResponse().getResults();
	
	}

	

}
