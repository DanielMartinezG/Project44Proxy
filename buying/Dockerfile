FROM openjdk:17-jdk-alpine
LABEL MAINTAINER=danielmartinezg95@gmail.com
ADD /build/libs/buying-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-XX:+UnlockDiagnosticVMOptions","-XX:+UnlockExperimentalVMOptions","-XX:MaxRAMPercentage=75.0", "-XshowSettings:vm","-server","-jar","-Djava.security.egd=file:/dev/./urandom","app.jar"]

