package com.example.budget_tracker_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.budget_tracker_spring.repository")
@EntityScan(basePackages = "com.example.budget_tracker_spring.entity")
public class BudgetTrackerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetTrackerSpringApplication.class, args);
	}

}
