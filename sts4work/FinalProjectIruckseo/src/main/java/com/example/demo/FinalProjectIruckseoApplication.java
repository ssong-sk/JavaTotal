package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"boot.data.*", "com.example.demo"})
@MapperScan({"boot.data.*"})
public class FinalProjectIruckseoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectIruckseoApplication.class, args);
	}

}
