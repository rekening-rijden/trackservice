FROM openjdk:17-jdk
MAINTAINER "Nick Litjens"
EXPOSE 80
COPY target/trackservice-0.0.1-SNAPSHOT.jar trackservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "trackservice-0.0.1-SNAPSHOT.jar"]