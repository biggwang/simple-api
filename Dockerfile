FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/simple-api.jar
COPY ${JAR_FILE} simple-api.jar
ENTRYPOINT ["java","-jar", "simple-api.jar"]