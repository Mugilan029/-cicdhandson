# apiworkflow

A basic Spring Boot REST API project created with Spring Initializr-style settings.

## Configuration

- Java 17
- Maven
- Spring Boot 4.1.2
- Spring Web
- No database dependencies

## Run

```bash
mvn spring-boot:run
```

Or build and run:

```bash
mvn clean package
java -jar target/apiworkflow-0.0.1-SNAPSHOT.jar
```

## Test endpoints

- `GET http://localhost:8080/api/users`
- `GET http://localhost:8080/api/users/1`
- `POST http://localhost:8080/api/users`

The POST endpoint is a simple practice endpoint and does not persist data.
