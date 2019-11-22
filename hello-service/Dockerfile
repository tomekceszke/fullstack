FROM amazoncorretto:11
MAINTAINER Tomasz Ceszke

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/share/hello/hello-service.jar"]

VOLUME /tmp
#ADD target/lib /usr/share/myservice/lib
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/hello/hello-service.jar
