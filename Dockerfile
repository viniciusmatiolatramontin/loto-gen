FROM eclipse-temurin:20
VOLUME /app
ARG JAR_FILE
COPY target/*.jar /loto-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/loto-api-0.0.1-SNAPSHOT.jar"]