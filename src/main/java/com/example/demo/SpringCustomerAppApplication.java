package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringCustomerAppApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCustomerAppApplication.class, args);
	}

}
