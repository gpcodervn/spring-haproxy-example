#FROM openjdk:8-jdk-alpine
FROM openjdk:11-jdk
MAINTAINER gpcoder.com
COPY build/libs/*SNAPSHOT.jar libs/client.jar
ENTRYPOINT ["java", "-jar", "/libs/client.jar"]