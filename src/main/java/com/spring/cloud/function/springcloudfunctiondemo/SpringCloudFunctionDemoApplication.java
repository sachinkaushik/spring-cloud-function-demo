package com.spring.cloud.function.springcloudfunctiondemo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionDemoApplication.class, args);
	}

	@Bean
	public Supplier<String> getMsg(){
		return () -> "Welcome to serverless programming...";
	}
	
	@Bean
	public Function<String, String> toUpperCase(){
		return (str) -> str.toUpperCase();
	}
	
	@Bean
	public Consumer<String> print(){
		return (str) -> System.out.print(str);
	}
	
}
