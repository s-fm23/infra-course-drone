FROM maven:3.8.5-openjdk-11 AS build
WORKDIR /app

COPY dev/pom.xml .

RUN mvn dependency:go-offline

COPY dev/src ./src

RUN mvn clean package

FROM openjdk:11-jre-slim
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080 5050

CMD ["java", "-Xms256m", "-jar", "app.jar"]
