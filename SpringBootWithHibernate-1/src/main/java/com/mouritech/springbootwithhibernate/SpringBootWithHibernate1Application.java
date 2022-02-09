package com.mouritech.springbootwithhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootWithHibernate1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithHibernate1Application.class, args);
	}

}
