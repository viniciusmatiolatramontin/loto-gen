FROM eclipse-temurin:20
VOLUME /app
COPY target\*.jar loto-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","loto-api-0.0.1-SNAPSHOT.jar"]