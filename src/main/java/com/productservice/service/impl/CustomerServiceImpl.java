package com.productservice.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.model.Customer;
import com.customerservice.repo.CustomerServiceRepository;
import com.customerservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerServiceRepository customerRepo;
	
	@Override
	public void createNewCustomer(Customer customer) {
		Customer existingCustomer = customerRepo.findById(customer.getCustomerId()).get();
		if(null == existingCustomer) {
			customerRepo.save(customer);
		}
	}

	@Override
	public Customer getCustomerDetails(String customerId) {
		return customerRepo.findById(customerId).get();
	}

	@Override
	public void updateCustomerDetails(String customerId, @Valid Customer customer) {
		if(customerId.equals(customer.getCustomerId())) {
			Customer existingCustomer = getCustomerDetails(customerId);
			existingCustomer.setAddress(customer.getAddress());
			existingCustomer.setCustomerName(customer.getCustomerName());
			existingCustomer.setCustomerType(customer.getCustomerType());
			customerRepo.save(existingCustomer);
		}
		
	}

}
