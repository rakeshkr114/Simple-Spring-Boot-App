FROM java:8
COPY ./target/SpringBootApp-0.0.1-SNAPSHOT.jar /usr/src/mySpringBootApp/SpringBootApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/usr/src/mySpringBootApp/SpringBootApp-0.0.1-SNAPSHOT.jar"]
