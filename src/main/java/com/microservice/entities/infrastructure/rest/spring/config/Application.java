package com.microservice.entities.infrastructure.rest.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.microservice.entities.infrastructure")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
