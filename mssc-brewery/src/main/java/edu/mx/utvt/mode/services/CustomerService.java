package edu.mx.utvt.mode.services;

import java.util.UUID;

import edu.mx.utvt.mode.dtos.CustomerDto;

public interface CustomerService {
	
	CustomerDto findCustomerById(UUID id);
	
	CustomerDto save (CustomerDto customerDto);
	
	void update(UUID id, CustomerDto customerDto);
	
	void delete(UUID id);

}
