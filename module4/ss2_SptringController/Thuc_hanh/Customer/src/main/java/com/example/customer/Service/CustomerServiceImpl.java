package com.example.customer.Service;

import com.example.customer.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class CustomerServiceImpl implements ICustomerService{
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1,"Quan",22,true));
        customerList.add(new Customer(2,"Linh",22,false));
        customerList.add(new Customer(3,"Linh",20,true));
    }
    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}
