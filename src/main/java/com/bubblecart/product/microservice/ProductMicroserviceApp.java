package com.bubblecart.product.microservice;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.bubblecart.product.microservice")
@SpringBootApplication
public class ProductMicroserviceApp {

    public static final Logger logger = LoggerFactory.getLogger(ProductMicroserviceApp.class);

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroserviceApp.class, args);
	}

}
