FROM eclipse-temurin:20
VOLUME /app
COPY .\target\loto-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]