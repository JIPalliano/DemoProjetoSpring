package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;
import com.example.demo.model.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Product")
public class ProductController{
    //Product product = new Product();
    @Autowired
    ProductService productService = new ProductService();

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    @RequestMapping("/ListProduct")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping
    public String getInfo(@RequestBody Product product) {
        //this.productService.save("Samba canção","Samba canção do bob esponja");
        productRepository.save(product);
        return "Salvo com sucesso!"+getProducts();
    }
}
