FROM openjdk:17-jdk-slim

# Copiar o arquivo JAR para o contêiner
COPY target/apiProdutosCategoricos-0.0.1-SNAPSHOT.jar /app/apiProdutosCategoricos.jar

# Definir o diretório de trabalho
WORKDIR /app

# Expor a porta utilizada pela aplicação Spring Boot
EXPOSE 8080

# Comando para executar a aplicação Spring Boot
CMD ["java", "-jar", "apiProdutosCategoricos.jar"]
