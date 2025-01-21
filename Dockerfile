FROM openjdk:21-jdk-oracle
LABEL authors="roger"
COPY ./target/app-roger.jar /app/app-roger.jar
WORKDIR /app
RUN mkdir "/app/uploaded_files/"
VOLUME /app/uploaded_files
EXPOSE 8080
CMD [ "java", "-jar", "app-roger.jar" ]