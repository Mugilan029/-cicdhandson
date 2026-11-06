
# Stage 1: Build Spring Boot application
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy project files
COPY . .

# Generate JAR file
RUN mvn clean install -DskipTests


# Stage 2: Run Spring Boot application
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy generated JAR directly
COPY --from=build /app/target/apiworkflow-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
