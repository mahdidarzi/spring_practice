package com.example.demo.product.ProductRepository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public String findProductName() {
        return "Laptop";
    }
}
