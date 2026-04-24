package com.customernfo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "customer_data")
public class Customer {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Customer_name")
	private String name;
	@Column(name = "Customer_age")
	private int age;
	@Column(name = "Customer_address")
	private String address ;
	@Column(name = "Customer_email")
	private String email;
	public Customer() {
		
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
	public Customer( String name, int age, String address, String email) {
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	
	

}




//Create Rest Api and perdorm crud operation on the Entity named Customer,with fields, id, name, age, address,email