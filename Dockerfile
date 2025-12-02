FROM openjdk:19-ea-1-slim
WORKDIR /app
COPY /build/libs/simple-java-app-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]