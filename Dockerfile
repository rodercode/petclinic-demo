FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/petclinic-demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /application.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/application.jar"]