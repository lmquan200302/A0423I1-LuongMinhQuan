package com.example.baitap.service;

import com.example.baitap.model.Customer;
import com.example.baitap.repository.CustomerRepository;

import java.util.List;

public class ListCustomer {
    CustomerRepository customerRepository = new CustomerRepository();

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
