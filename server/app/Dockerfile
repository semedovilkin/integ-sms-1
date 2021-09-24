FROM openjdk:11.0.8-jre

MAINTAINER Teymur Valiyev <teymur.valiyev@cybernet.az>

WORKDIR /app
RUN mkdir -p /app/files
ADD ./target/*.jar app.jar
COPY ./server/app/entrypoint.sh .
RUN chmod +x /app/entrypoint.sh
EXPOSE 8000
ENTRYPOINT ["bash","/app/entrypoint.sh"]