FROM openjdk:8-jre-alpine
RUN mkdir  /app
COPY ./target/demo-docker-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java","-jar","/app/demo-docker-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
