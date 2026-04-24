package com.customernfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customernfo.entity.Customer;
@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	
	

}
