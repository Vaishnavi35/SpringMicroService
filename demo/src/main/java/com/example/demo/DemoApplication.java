package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("demo app");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
   @LoadBalanced
   public RestTemplate restTemplate(){
      return new RestTemplate();
   }
}
