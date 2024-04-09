# Use an official OpenJDK runtime as the base image
FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files to the container
COPY . .

# Build the Maven project to generate the JAR file
RUN /app/mvnw package -DskipTests

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "target/fake-rest-api-0.0.1-SNAPSHOT.jar"]