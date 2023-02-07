FROM eclipse-temurin:11-alpine
RUN mkdir /app
WORKDIR /app
COPY target/spring-deploy-1.0.jar /app/spring-deploy.jar
EXPOSE 8080
CMD java -jar spring-deploy.jar