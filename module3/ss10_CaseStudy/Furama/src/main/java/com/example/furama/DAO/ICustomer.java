package com.example.furama.DAO;

import com.example.furama.Model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomer {
List<Customer> selectAllCustomer();

List<Customer> selectByName(String nameSearch) throws SQLException;
void insertCustomer(Customer customer) throws SQLException;

}
