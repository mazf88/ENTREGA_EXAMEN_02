package com.poli.techno.aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.poli.techno.services,com.poli.techno.repositories,com.poli.techno.entities")
@EntityScan(basePackages = { "com.poli.techno.entities" })
@EnableJpaRepositories("com.poli.techno.repositories")
public class TechnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnoApplication.class, args);
	}

}
