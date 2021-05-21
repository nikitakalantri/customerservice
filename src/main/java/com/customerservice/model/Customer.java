package com.customerservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.customerservice.enums.CustomerType;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	String customerId;
	String customerName;
	Address address;
	CustomerType customerType;
	//other details
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	

}
