#spring-nested-config-properties
Using spring-boot's new @ConfigurationProperties annotation to try out loading properties. Having a well structured properties file will allow you to benefit from this annotation.


##Running the application 
*mvn clean install && java -jar target/spring-nested-config-properties-0.0.1-SNAPSHOT.jar*


##Outcome
 1. The command, builds the application and runs the jar file immediately.
 2. The list of existing properties **(classpath:external/project.properties OR classpath:external/project.yml)** will be printed in the console.


###Properties file

The class **PropertiesManager.java** is the manager for the properties within the project. It consists of 2 inner classes (which could have also been normal classes), and a String field. Notice that all field names are written by the same convention the properties are defined in the **project.properties** file. For each layer of properties the relevant class is used.

What do I mean by this ?

For property "example.email.from" we simply defined "private String from;".
For properties under "example.email.registration", an inner class **RegistrationProperties** was created with all fields inside i.e: "example.email.registration.subject" = "RegistrationProperties.subject", so on and so fort for the rest of the properties.
Now since both Registration and Verification classes have the same properties, it was more convenient to create **AbstractEmailProperties** holding the common properties, and then made the inner classes extend it.



###YAML file

Spring boot also supports the usage of YAML files instead of properties files. The only change required would be to add the YML file with all the properties inside. Then in the **Application.java**, remove the **@PropertySource** annotation, since this is only used to detect traditional property files, and uncomment the **yamlProperties()** method. This method used the **YamlPropertiesFactoryBean** to load externalised yml files.

##Authors
 - Ryan Calleja - callejaryan@gmail.com


