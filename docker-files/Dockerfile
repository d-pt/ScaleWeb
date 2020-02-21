FROM  tomcat:8.5.51-jdk8-openjdk

ARG APP_NAME
WORKDIR /usr/local/tomcat/webapps
RUN mkdir ${APP_NAME}

#creating supporting directory
RUN mkdir -p /data/epct/deployment/ \
    && mkdir /data/epct/logs/
#copying support  files
COPY /docker-files    /data/epct/deployment/

COPY /target/${APP_NAME}    /usr/local/tomcat/webapps/${APP_NAME}/

EXPOSE 8080

#CMD ["catalina.sh", "run"]
