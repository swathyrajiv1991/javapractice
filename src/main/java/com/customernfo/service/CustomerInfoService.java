package com.customernfo.service;

import java.util.List;

import com.customernfo.dto.CustomerInfoDTO;


public interface CustomerInfoService {
   CustomerInfoDTO createCustomer(CustomerInfoDTO cdto);
   CustomerInfoDTO getCustomerById(Long id);
   List< CustomerInfoDTO>getAllCustomer();
   CustomerInfoDTO updateCustomer(Long id,CustomerInfoDTO cdto);
   void deleteCustomer(Long id);
   
}



