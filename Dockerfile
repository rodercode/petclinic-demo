FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/petclinic-demo-0.0.1-SNAPSHOT.jar petclinic-demo.jar
ENTRYPOINT ["java", "-jar", "/petclinic-demo.jar"]