# ServiceLogs
Spring Framework based Service Logging

Based on https://projects.spring.io/spring-cloud/ and http://cloud.spring.io/spring-cloud-sleuth/.

## Dependencies
At least: Java 8 and Maven 3.5

## Build Service Logging
mvn package -DskipTests=true

## Run Service Registry
### Environment variables
#### EUREKA_ZONE 
Default value: http://127.0.0.1:8761/eureka/
Defining all available Eureka Instances.

### Windows
java -jar target\ServiceLogging-0.0.1-SNAPSHOT.jar

### Linux (service enabled)
./target/ServiceLoggin-0.0.1-SNAPSHOT.jar start

