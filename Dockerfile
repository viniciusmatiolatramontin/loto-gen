FROM eclipse-temurin:20
VOLUME /app
ARG JAR_FILE
COPY ./*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]