package com.example.customer.Service;

import com.example.customer.Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
private static List<Customer> customerList = new ArrayList<>();
static {
    customerList.add(new Customer("Quan","20/03/2002","Quang Nam"));
    customerList.add(new Customer("Hien","10/1/2002","Hue"));
    customerList.add(new Customer("Linh","11/9/2001","Da Nang"));
}

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerList);
    }



}
