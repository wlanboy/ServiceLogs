#!/bin/bash
set -e

mvn package -DskipTests=true
docker build -t servicelogs:latest . --build-arg JAR_FILE=./target/ServiceLogs-0.0.1-SNAPSHOT.jar
docker run --name servicelogs -d -p 9411:9411 --link serviceregistry:serviceregistry -v /tmp:/tmp servicelogs:latest
