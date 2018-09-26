#!/bin/sh

docker logout
docker build -t pkrajanand/weatherui:1.0 ./front-end 
docker images | grep weatherui
docker-compose -f ./front-end/docker-compose.yml up
