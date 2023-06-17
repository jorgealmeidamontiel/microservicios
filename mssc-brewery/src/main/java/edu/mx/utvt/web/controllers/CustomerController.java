package edu.mx.utvt.web.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mx.utvt.mode.dtos.CustomerDto;
import edu.mx.utvt.mode.services.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerDto> getById(@PathVariable("id") UUID customerId) {
		return ResponseEntity.ok(customerService.findCustomerById(customerId));
	}

}
