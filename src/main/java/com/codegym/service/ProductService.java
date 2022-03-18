package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(1,"Sting",10000,"Nuoc tang luc","/WEB-INF/views/img/sting-removebg-preview.png"));
        products.add(new Product(2,"Sting",10000,"Nuoc tang luc","/WEB-INF/views/img/sting-removebg-preview.png"));
        products.add(new Product(3,"Sting",10000,"Nuoc tang luc","/WEB-INF/views/img/sting-removebg-preview.png"));
        products.add(new Product(4,"Sting",10000,"Nuoc tang luc","/WEB-INF/views/img/sting-removebg-preview.png"));
        products.add(new Product(5,"Sting",10000,"Nuoc tang luc","/WEB-INF/views/img/sting-removebg-preview.png"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void createProduct(Product Product) {
        products.add(Product);
    }

    @Override
    public int findById(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public Product findProductById(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                return products.get(index);
            }
        }
        return null;
    }


    @Override
    public void update(int id, Product product) {
        int index = findById(id);
        products.set(index, product);
    }

    @Override
    public void delete(Product product) {
        products.remove(product);
    }
}
