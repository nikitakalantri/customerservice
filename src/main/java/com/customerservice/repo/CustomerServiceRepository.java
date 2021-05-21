package com.customerservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerservice.model.Customer;

@Repository
public interface CustomerServiceRepository extends JpaRepository<Customer, String>{

}