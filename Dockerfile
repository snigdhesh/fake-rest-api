# Use an official OpenJDK runtime as the base image
FROM openjdk

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/fake-rest-api-0.0.1-SNAPSHOT.jar /app

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "fake-rest-api-0.0.1-SNAPSHOT.jar"]