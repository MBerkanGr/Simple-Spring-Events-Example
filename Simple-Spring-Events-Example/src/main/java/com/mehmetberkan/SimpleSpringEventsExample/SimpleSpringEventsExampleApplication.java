package com.mehmetberkan.SimpleSpringEventsExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SimpleSpringEventsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringEventsExampleApplication.class, args);
	}

}
