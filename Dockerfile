FROM maven:3.9.4-eclipse-temurin-20 AS build
COPY /src /app/src
COPY /pom.xml /app
RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip

FROM openjdk:22
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]