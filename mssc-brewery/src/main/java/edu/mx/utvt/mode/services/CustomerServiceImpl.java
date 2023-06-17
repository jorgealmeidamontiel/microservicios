package edu.mx.utvt.mode.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.mx.utvt.mode.dtos.CustomerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto findCustomerById(UUID id) {
		log.trace("findCustomerById: " + id);
		return CustomerDto.builder().id(UUID.randomUUID()).name("Jorge").build();
	}

	@Override
	public CustomerDto save(CustomerDto customerDto) {
		log.trace("findCustomerById: " + customerDto.toString());
		return null;
	}

	@Override
	public void update(UUID id, CustomerDto customerDto) {
		log.trace("findCustomerById: " + id);
		
	}

	@Override
	public void delete(UUID id) {
		log.trace("findCustomerById: " + id);
		
	}

}
