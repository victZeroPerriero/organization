FROM openjdk:11
COPY target/*.jar organization.jar
ENTRYPOINT [ "java", "-jar", "/organization.jar"]
