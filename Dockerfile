FROM openjdk:17
ARG JAR_FILE=target/petclinic-demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /petclinic-demo
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/application.jar"]
