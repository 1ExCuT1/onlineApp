# Use a minimal Java 17 runtime base image
FROM maven:3.9-eclipse-temurin-17-alpine AS build

# Set the working directory
WORKDIR /onlineApp

# Copy Maven files and download dependencies first (for caching)
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
RUN ./mvnw dependency:go-offline

# Copy the entire project and build it
COPY . .
RUN ./mvnw clean package -DskipTests
FROM eclipse-temurin:17-jdk-alpine

# Set a working directory inside the container
WORKDIR /app

# Copy the packaged jar file into the container
# Replace 'your-app.jar' with the actual name of your jar file
COPY target/onlineApp-0.0.1-SNAPSHOT.jar onlineApp.jar

# Expose the port your Spring Boot app runs on (default is 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "onlineApp.jar"]