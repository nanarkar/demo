# Pull base image
From tomcat:8-jre8 
# Maintainer 
MAINTAINER "Zoheb Nawaz <zoheb.nawaz@northagteps.com">
# Copy to images tomcat path 
ADD target/Webapp.war /usr/local/tomcat/webapps/
ADD conf/ /usr/local/tomcat/conf/
ADD conf/context.xml /usr/local/tomcat/webapps/manager/META-INF