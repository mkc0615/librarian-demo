FROM openjdk:17-slim-buster

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR files for each module to the container
COPY presentation-rest/build/libs/presentation-rest*.jar presentation-rest.jar
COPY application/build/libs/application*.jar application.jar
COPY infrastructure/build/libs/infrastructure*.jar infrastructure.jar
COPY domain-core/build/libs/domain-core*.jar domain-core.jar
COPY domain-user/build/libs/domain-user*.jar domain-user.jar
COPY domain-book/build/libs/domain-book*.jar domain-book.jar
COPY domain-checkout/build/libs/domain-checkout*.jar domain-checkout.jar

# Expose the port your application will run on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "presentation-rest.jar"]
