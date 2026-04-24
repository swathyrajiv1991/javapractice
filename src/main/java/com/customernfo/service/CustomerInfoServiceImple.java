package com.customernfo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customernfo.dto.CustomerInfoDTO;
import com.customernfo.entity.Customer;
import com.customernfo.mapper.CustomerMapper;
import com.customernfo.repository.CustomerRepository;



@Service
public class CustomerInfoServiceImple implements CustomerInfoService{
	
	@Autowired
	private CustomerRepository customerRepository;
	

	@Override
	public CustomerInfoDTO createCustomer(CustomerInfoDTO cdto) {
		// TODO Auto-generated method stub
		Customer customer = CustomerMapper.mapToEntity(cdto);
		
		return CustomerMapper.mapToDTO(customerRepository.save(customer));
	}

	@Override
	public CustomerInfoDTO getCustomerById(Long id) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customernot found"));
		return CustomerMapper.mapToDTO(customer);
	}

	@Override
	public List<CustomerInfoDTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return  customerRepository.findAll().stream().map(CustomerMapper::mapToDTO).collect(Collectors.toList());
	}

	@Override
	public CustomerInfoDTO updateCustomer(Long id, CustomerInfoDTO cdto) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
		customer.setName(cdto.getName());
		customer.setAddress(cdto.getAddress());
		customer.setAge(cdto.getAge());
		customer.setEmail(cdto.getEmail());
		return CustomerMapper.mapToDTO(customerRepository.save(customer));
		
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		
	}
	

}
