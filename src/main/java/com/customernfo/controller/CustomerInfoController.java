package com.customernfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customernfo.dto.CustomerInfoDTO;
import com.customernfo.service.CustomerInfoService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/customerapi")
public class CustomerInfoController {
	
	@Autowired
	private CustomerInfoService customerInfoService;
	@PostMapping("/saveProduct")
	public CustomerInfoDTO insertProduct(@Valid@RequestBody CustomerInfoDTO cdto) {
		return customerInfoService.createCustomer(cdto);
		
	}
	//helps to find the variable from url and giv to variable
	@GetMapping("customer/{id}")
	public CustomerInfoDTO fetchProduct(@PathVariable Long  id) {
		return customerInfoService.getCustomerById(id);
	}
	@GetMapping("/customer")
 public List<CustomerInfoDTO> fetchAllCustomer() {
	 return customerInfoService.getAllCustomer();
	 
 }
 
 
 @PostMapping("/updateCustomer/{id}")
 public CustomerInfoDTO updateProductById(@Valid @PathVariable Long id,@RequestBody CustomerInfoDTO cdto) {
	 return customerInfoService.updateCustomer(id, cdto);
	 
 }
 
 
 @DeleteMapping("/deleteCustomer/{id}")
 public String deleteProductById(@PathVariable Long id) {
	 customerInfoService.deleteCustomer(id);
	 return "Product deleted successfully";
	 
 }

}






