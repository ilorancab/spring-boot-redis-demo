FROM openjdk:11.0.4-jre-slim
COPY /target/spring-boot-redis-demo-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-redis-demo-0.0.1-SNAPSHOT.jar"]