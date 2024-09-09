package com.example.demo.model;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.beans.ConstructorProperties;


@Data
public class Product {

    @Id
    private String id;
    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
