# spring-boot-app
Microservice using Spring Boot Application Java Spring Boot Framework

### How to use this Microservice?

_First_, clone it with .ssh (Note: please see how to configure .ssh for github)

_Second_, after running maven lifecycle, run the command in the terminal: java -jar target/spring-boot-app-1.0-SNAPSHOT.jar

_Third_, use postman to make sure this microservice is up and running

so, (1) to make **GET** call: use localhost:8080/v1/customers

to make other HTTP calls;

(2) **PUT** call, in order to update any info simply copy the requested JSON, change any variables (parameters) and then make PUT class, MAKE SURE, your body should contain JSON and change the raw type to Application/JSON as Media

(3) **Delete**

(4) **POST**: insert new data as JSON and body should be Application/JSON as Media
