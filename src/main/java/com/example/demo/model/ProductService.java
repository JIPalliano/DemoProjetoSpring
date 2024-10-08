package com.example.demo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(String name, String description) {
        Product product = new Product(name, description);
        this.productRepository.save(product);
    }
}
