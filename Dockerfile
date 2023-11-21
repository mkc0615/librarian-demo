FROM openjdk:17-slim-buster
WORKDIR /app
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} application.jar
CMD ["java", "-jar", "application.jar"]