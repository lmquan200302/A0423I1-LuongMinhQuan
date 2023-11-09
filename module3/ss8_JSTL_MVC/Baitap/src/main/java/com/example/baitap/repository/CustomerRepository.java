package com.example.baitap.repository;

import com.example.baitap.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private static List<Customer> customers = new ArrayList();
    static{
        customers.add(new Customer("Quan","20/3/2002","Quang Nam"));
        customers.add(new Customer("Minh","10/6/2002","Da Nang"));
        customers.add(new Customer("Ngan","11/9/2002","Hue"));

    }

    public List<Customer> findAll() {
        return customers;
    }
}
