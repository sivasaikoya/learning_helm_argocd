# Use Java 21 lightweight runtime
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copy the Spring Boot jar
COPY target/*.jar app.jar

# Expose Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]