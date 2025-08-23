FROM eclipse-temurin:17-jdk

WORKDIR /onlineApp
COPY . .
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests
CMD ["java", "-jar", "target/onlineApp-0.0.1-SNAPSHOT.jar"]