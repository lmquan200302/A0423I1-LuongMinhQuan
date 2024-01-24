package com.example.customer.Service;

import com.example.customer.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findOne(int id);
    void save(Customer customer);
    void delete(int id);
}
