FROM openjdk:22-jdk-slim
LABEL authors="phani"
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]