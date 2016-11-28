package com.rcalleja.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
		"classpath:application.properties",
		"classpath:external/project.properties"
})
public class SpringNestedConfigPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNestedConfigPropertiesApplication.class, args);
	}
}
