package com.example.productmanager.Service;

import com.example.productmanager.Model.Product;

import java.util.List;

public interface ProductService  {
List<Product> findAll();
void save (Product product);
Product findById(int id);
void update (int id, Product product);
void remove (int id);

}
