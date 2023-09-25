FROM eclipse-temurin:20
VOLUME /app
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]