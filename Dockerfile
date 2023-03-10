FROM eclipse-temurin:17-jdk-alpine as builder
COPY target/stalker-jokes-generator*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:17-jdk-alpine
COPY --from=builder dependencies/ ./
COPY --from=builder spring-boot-loader/ ./
COPY --from=builder snapshot-dependencies/ ./
COPY --from=builder application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher", "--spring.config.additional-location=file:/etc/secrets/application-secrets.yml"]