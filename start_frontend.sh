#!/bin/sh

docker logout
docker build -t pkrajanand/weatherui:1.0 ./frontend 
docker images | grep weatherui
docker-compose -f ./frontend/docker-compose.yml up
