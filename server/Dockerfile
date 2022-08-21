#FROM openjdk:8-jdk-alpine
FROM openjdk:11-jdk
MAINTAINER gpcoder.com
COPY build/libs/*SNAPSHOT.jar libs/server.jar
ENTRYPOINT ["java", "-jar", "/libs/server.jar"]