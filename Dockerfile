FROM openjdk:11
ADD target/spring-db-example.jar spring-db-example.jar
ENTRYPOINT ["java", "-jar", "spring-db-example.jar"]
