# ServiceLogs
Spring Framework based Service Logging

Based on https://projects.spring.io/spring-cloud/ and http://cloud.spring.io/spring-cloud-sleuth/.

## Dependencies
At least: Java 8 and Maven 3.5

## Build Service Logging
mvn package -DskipTests=true

## Run Service Logging
### Environment variables

### Windows
java -jar target\servicelogs-0.0.2-SNAPSHOT.jar

### Linux (service enabled)
./target/servicelogs-0.0.2-SNAPSHOT.jar start

## Docker build
docker build -t servicelogs:latest . --build-arg JAR_FILE=./target/servicelogs-0.0.2-SNAPSHOT.jar

## Docker run
docker run --name servicelogs -d -p 9411:9411 -v /tmp:/tmp servicelogs:latest

## Check Traces
http://localhost:9411/zipkin
