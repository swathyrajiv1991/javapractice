package com.customernfo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CustomerInfoDTO {
	
	
	private Long id;
	@NotBlank(message = "Name canʻt be null")
	private String name;
	@NotNull(message = "Age canʻt be null")
	@Positive(message = "Age should be positive")
	private int age;
	@NotBlank(message = "Name canʻt be blank")
	private String address;
	@NotBlank(message = "Email canʻt be blank")
	private String email;
	
	
	
	public CustomerInfoDTO() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public CustomerInfoDTO( String name, int age, String address, String email) {
	
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	
	
	
	
	
	

}
