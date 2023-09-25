FROM maven:4.0.0 AS build
COPY src /home/loto-api/src
COPY pom.xml /home/loto-api
RUN mvn -f /home/loto-api/pom.xml clean package

FROM openjdk:20
COPY /target/loto-gen-0.0.1-SNAPSHOT.jar loto-gen-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","loto-gen-0.0.1-SNAPSHOT.jar"]