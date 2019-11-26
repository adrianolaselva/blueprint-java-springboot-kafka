package com.laselva.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExampleKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleKafkaApplication.class, args);
	}

}
