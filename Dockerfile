
FROM maven:3.8.3-openjdk-17 as build

WORKDIR /app

COPY . .

RUN mvn clean install


FROM openjdk

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY --from=build /app/target/fake-rest-api-0.0.1-SNAPSHOT.jar /app

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "fake-rest-api-0.0.1-SNAPSHOT.jar"]