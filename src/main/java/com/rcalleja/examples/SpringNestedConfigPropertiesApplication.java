package com.rcalleja.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = "com.rcalleja.examples")
@PropertySource({
		"classpath:application.properties",
		"classpath:external/project.properties"
})
public class SpringNestedConfigPropertiesApplication {

	@Autowired
	private PropertiesManager propertiesManager;

	public static void main(String[] args) {
		SpringApplication.run(SpringNestedConfigPropertiesApplication.class, args);
	}

	@Bean
	public boolean printProperties(){
		System.out.println("----------------------------------------------------------");
		System.out.printf("example.email.from : %s%n", propertiesManager.getFrom());
		System.out.println("----------------------------------------------------------");
		System.out.printf("example.email.registration.subject : %s%n",
				propertiesManager.getRegistration().getSubject());
		System.out.printf("example.email.registration.plain : %s%n",
				propertiesManager.getRegistration().getPlain());
		System.out.printf("example.email.registration.html : %s%n",
				propertiesManager.getRegistration().getHtml());
		System.out.println("----------------------------------------------------------");
		System.out.printf("example.email.verification.subject : %s%n",
				propertiesManager.getVerification().getSubject());
		System.out.printf("example.email.verification.plain : %s%n",
				propertiesManager.getVerification().getPlain());
		System.out.printf("example.email.verification.html : %s%n",
				propertiesManager.getVerification().getHtml());
		System.out.println("----------------------------------------------------------");
		return true;
	}
}
