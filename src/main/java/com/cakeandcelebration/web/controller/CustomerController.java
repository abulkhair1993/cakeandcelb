package com.cakeandcelebration.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@PostMapping("/api/v1/customers")
	public String addCustomers() {
		return "successfull";
	}
	

}
