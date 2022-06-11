package com.mrgiovanotti.auditdatatutorial.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrgiovanotti.auditdatatutorial.entities.Customer;
import com.mrgiovanotti.auditdatatutorial.repositories.CustomerRepository;
import com.mrgiovanotti.auditdatatutorial.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
	return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
	return customerRepository.save(customer);
    }

    @Override
    public Customer findById(Integer id) {
	return customerRepository.findById(id).orElse(null);
    }

}
