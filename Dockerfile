FROM openjdk:8
EXPOSE 8080
ADD target/petclinic-demo.jar petclinic-demo.jar
ENTRYPOINT ["java","-jar","/petclinic-demo.jar"]

