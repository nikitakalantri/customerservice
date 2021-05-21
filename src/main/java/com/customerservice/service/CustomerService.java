package com.customerservice.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.customerservice.model.Customer;

@Service
public interface CustomerService {

	public void createNewCustomer(Customer customer);

	public Customer getCustomerDetails(String customerId);

	public void updateCustomerDetails(String customerId, Customer customer);

}
