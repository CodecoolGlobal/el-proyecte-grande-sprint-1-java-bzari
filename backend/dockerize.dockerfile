FROM alpine
LABEL maintainer="aron"
RUN apk --update add openjdk17-jre
COPY target/el-proyecte-grande-sprint-1-java-bzari-1.0-SNAPSHOT.jar terra-visio.jar
CMD ["java", "-jar", "terra-visio.jar"]

EXPOSE 8080