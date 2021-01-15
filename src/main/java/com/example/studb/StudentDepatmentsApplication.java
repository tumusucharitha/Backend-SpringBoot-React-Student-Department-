package com.example.studb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.example.studb.repository")
@ComponentScan(basePackages = {"com.example.studb"})
public class StudentDepatmentsApplication {

	public static void main(String[] args) {
		 System.out.println("version: " + SpringVersion.getVersion());
		SpringApplication.run(StudentDepatmentsApplication.class, args);
	}

}
