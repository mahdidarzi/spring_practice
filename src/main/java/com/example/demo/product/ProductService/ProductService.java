package com.example.demo.product.ProductService;

import com.example.demo.product.ProductRepository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String getProduct() {
        return productRepository.findProductName();
    }
}
