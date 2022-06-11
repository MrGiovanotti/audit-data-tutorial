package com.mrgiovanotti.auditdatatutorial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrgiovanotti.auditdatatutorial.entities.Customer;
import com.mrgiovanotti.auditdatatutorial.entities.dto.CustomerDTO;
import com.mrgiovanotti.auditdatatutorial.services.CustomerService;

@RestController
@RequestMapping(path = "/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(path = "/list")
    public List<Customer> list() {
	return customerService.findAll();
    }

    @PostMapping(path = "/save")
    public Customer save(@RequestBody CustomerDTO customerDTO) {
	Customer customer = new Customer(customerDTO);
	return customerService.save(customer);
    }

    @PutMapping("/update")
    public Customer update(@RequestBody CustomerDTO customerDTO) {
	Customer customer = customerService.findById(customerDTO.getId());
	if (customer != null) {
	    customer.setName(customerDTO.getName());
	    customer.setLastname(customerDTO.getLastname());
	    return customerService.save(customer);
	}
	return null;
    }

}
