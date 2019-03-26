# upms-monitor docker 配置
FROM frolvlad/alpine-oraclejdk8

MAINTAINER Perye(11143526@qq.com)

VOLUME /tmp

ENV PROJECT_HOME /Volumes/PERYE/upms
ENV TOMCAT_HOME /usr/local/tomcat/webapps
ENV OUTPUT_HOME /Volumes/PERYE/upms-file

RUN mkdir -p "$PROJECT_HOME" && mkdir -p "$OUTPUT_HOME" && mkdir -p "$TOMCAT_HOME"

ADD ./target/upms-monitor.jar /Volumes/PERYE/upms/upms-monitor.jar

WORKDIR /Volumes/PERYE/upms

# 指定容器内的时区
RUN echo "Asia/Shanghai" > /etc/timezone

RUN sh -c 'touch  /upms-monitor.jar'

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /Volumes/PERYE/upms/upms-monitor.jar" ]

EXPOSE 8180

# docker run -it -d --name upms-monitor -p8180:8180 -v /Volumes/PERYE/upms-file:/Volumes/PERYE/upms-file upms-monitor:v1
