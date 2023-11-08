package com.example.productmanager.Service;

import com.example.productmanager.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceimpl implements ProductService{
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Iphone","American",19000));
        productList.add(new Product(2,"Sam Sung","Korea",10000));
        productList.add(new Product(3,"Vin Smart","Viet Nam",500));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void save(Product product) {
    productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product:productList) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        productList.add(id,product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);

    }
}

