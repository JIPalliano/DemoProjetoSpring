package com.example.demo;

import com.example.demo.model.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//@Autowired
	//private ProductService producer;

	//@Override
	//public void run(String... args) throws Exception{
	//	this.producer.save("Blusa", "Blusa Azul");
	//}

}
