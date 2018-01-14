# spring-boot-crudrepository-seed
Spring Boot CrudRepository example. Spring Boot Data enables JPA repository support by default. CrudRepository provides generic CRUD operation on a repository for a specific type.

===H2 Db===
Inside the resource folder is included a data.sql which automatic insert the first 4 record to allow you to see the API up and running

===Build and Run===
1. Using Maven Command: Go to the root folder of the project using command prompt and run the command.
*mvn spring-boot:run*

2. Using Executable JAR: Using command prompt, go to the root folder of the project and run the command.
*mvn clean package* 
We will get executable JAR companu-0.0.1-SNAPSHOT.jar in target folder. 
Run this JAR as
*java -jar target/company-0.0.1-SNAPSHOT.jar*

Tomcat server will be started.
