package com.agricos.agricos;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@EntityScan("com")
@ComponentScan(basePackages = {"com.agricos"})
@EnableJpaRepositories(basePackages = "com.agricos.repository")
public class AgricosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgricosApplication.class, args);
		
		
		
		System.out.println("run");
		
		
		
	}

}
