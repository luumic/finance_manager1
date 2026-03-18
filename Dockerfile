FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/moneymanager-0.0.1-SNAPSHOT.jar finance-v1.0.jar
EXPOSE 9090
ENTRYPOINT ["java", "jar", "finance-v1.0.jar"]