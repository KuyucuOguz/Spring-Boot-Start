package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;



@EnableJdbcRepositories
@SpringBootApplication
//@EntityScan("spring.jsp")
//@EnableAutoConfiguration(
//exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//@GetMapping
	//public String hello(){
	//	return "Hello!";
	//}
}

