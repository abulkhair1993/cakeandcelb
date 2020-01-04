package com.cakeandcelebration.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcutController {
	
	@GetMapping("/api/v1/products")
	public String getAllProucts() {
		
		
		return "[{\"name\":\"Item1\",\"name\":\"Item2\" }]";
	}

}
