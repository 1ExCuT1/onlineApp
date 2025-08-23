# Use a minimal Java 17 runtime base image
FROM eclipse-temurin:17-jdk-alpine

# Set a working directory inside the container
WORKDIR /app

# Copy the packaged jar file into the container
# Replace 'your-app.jar' with the actual name of your jar file
COPY target/*.jar onlineApp.jar

# Expose the port your Spring Boot app runs on (default is 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "onlineApp.jar"]