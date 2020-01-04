package com.cakeandcelebration.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@PostMapping("/api/v1/customers")
	public String addCustomers() {
		return "[{\"id\":\"1\", \"shopName\": \"Poona Central \",\"productList\": [{\"pestry\": \"2\"}, {\"cake\": \"2\"}]}, {\"id\":\"2\",\"shopName\": \"Poona Central 2\",\"productList\": [{\"item2\": \"2\"}, {\"item5\": \"2\"}]}]";
	}
	

}
