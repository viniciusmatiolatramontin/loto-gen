FROM maven:3.9.4-eclipse-temurin-11 AS build
COPY src /loto-api/src
COPY pom.xml /loto-api
RUN mvn -f /loto-api/pom.xml clean package -Dmaven.test.skip

FROM openjdk:20
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]