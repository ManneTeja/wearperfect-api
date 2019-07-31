package com.wearperfect.datastoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.wearperfect.datastoreapi.repositories")
public class WpDatastoreapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpDatastoreapiApplication.class, args);
	}

}
