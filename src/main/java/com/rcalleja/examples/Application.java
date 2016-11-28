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
public class Application {

	@Autowired
	private PropertiesManager propertiesManager;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	/*
	 - Uncomment this to use YML files configs. Comment out the @PropertySource annotation above.

	@Bean
	public static PropertySourcesPlaceholderConfigurer yamlProperties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
				new PropertySourcesPlaceholderConfigurer();
		YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
		yaml.setResources(new ClassPathResource("external/project.yml"));
		propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
		return propertySourcesPlaceholderConfigurer;
	}*/

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
