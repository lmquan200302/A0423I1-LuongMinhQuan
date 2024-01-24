package com.example.product.Respository;

import com.example.product.Model.Product;

import java.util.List;

public interface IProductRespo {
    List<Product> findAll();
    void save(Product product);
    Product findOne(int id);
    void delete(int id);
}
