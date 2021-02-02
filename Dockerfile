FROM openjdk:11
#RUN addgroup -S spring && adduser spring -G spring
#USER spring:spring
#ARG JAR_FILE=target/petshop-0.0.1-SNAPSHOT.jar
COPY target/petshop-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]