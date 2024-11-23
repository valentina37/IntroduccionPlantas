FROM openjdk:17
COPY "./target/introduccion-1.jar" "app.jar"
EXPOSE 8010
ENTRYPOINT [ "java", "-jar", "app.jar" ]
