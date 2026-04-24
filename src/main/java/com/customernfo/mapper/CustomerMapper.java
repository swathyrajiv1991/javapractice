package com.customernfo.mapper;

import com.customernfo.dto.CustomerInfoDTO;
import com.customernfo.entity.Customer;

public class CustomerMapper {

	public static CustomerInfoDTO mapToDTO(Customer customer) {
		
		
		CustomerInfoDTO ctdo = new CustomerInfoDTO();
		ctdo.setId(customer.getId());
		ctdo.setName(customer.getName());
		
		ctdo.setAge(customer.getAge());
		ctdo.setAddress(customer.getAddress());
		ctdo.setEmail(customer.getEmail());
		
		
		return ctdo;
		
		
		
	}
	
	public static Customer mapToEntity(CustomerInfoDTO cdto) {
		
		Customer customer = new Customer();
		customer.setId(cdto.getId());
		customer.setName(cdto.getName());
		customer.setAddress(cdto.getAddress());
		customer.setAge(cdto.getAge());
		customer.setEmail(cdto.getEmail());
		
		customer.setId(cdto.getId());
		return customer;
		
	}
	
	
}
