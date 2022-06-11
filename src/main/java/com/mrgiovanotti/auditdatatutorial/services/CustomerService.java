package com.mrgiovanotti.auditdatatutorial.services;

import java.util.List;

import com.mrgiovanotti.auditdatatutorial.entities.Customer;

public interface CustomerService {

    List<Customer> findAll();

    Customer save(Customer customer);

    Customer findById(Integer id);

}
