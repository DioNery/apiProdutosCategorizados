FROM openjdk:17-jdk-slim

COPY target/apiProdutosCategoricos-0.0.1-SNAPSHOT.jar /app/apiProdutosCategoricos.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "apiProdutosCategoricos.jar"]
