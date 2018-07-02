FROM tomcat:latest
MAINTAINER Onur Ozkol "me@me.com"
RUN ["rm", "-fr", "/usr/local/tomcat/webapps/ROOT"]
ADD ./target/hrweb.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]

