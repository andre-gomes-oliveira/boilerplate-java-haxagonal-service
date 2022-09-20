FROM amazoncorretto:17-alpine-jdk

ARG JAR_FILE=origin-app/target/*.jar

COPY ${JAR_FILE} app.jar

COPY .env .env

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]