package com.SpringTest.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

}
