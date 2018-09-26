# Weather Forecaster (WeFor)
A light-weight weather reporting application based on OpenWeatherMap API.

This project is initiated while participating in an employment recruitment process in 2016. Later on, project is enhanced to try out new concepts and technologies.

System Requirement:
------------------------------------
* JDK 1.8+  
* MAVEN 3.5.4
* Docker

Running application:
------------------------------------
* Backend: ```mvn spring-boot:run```
* Frontend: ```./start_frontend.sh```

Accessing application:
------------------------------------
* Backend: ```http://localhost:8080/```
* frontend: ```http://localhost:44000/```

Technology Stack
------------------------------------
* Front-end: HTML, AngularJS 1.3, CSS, NodeJs Express
* Back-end: Spring Boot 2.0.5, JDK 8, Lombok
* SCM : GitHub
* Test Automation: JUnit 4, Mockito, Jacoco, Sonar, Docker(from https://github.com/mechero/code-quality-game)
* Build & Package : Maven
* Dev Env Support: Spring-Boot embedded Tomcat, STS 3.9.4, Mac OSX 10.13.6 
* Containerization: Docker

Architectural Overview
------------------------------------
Current implementation make use of a free service provided by Open Weather Map(http://openweathermap.org) for weather updates. But this could easily be replaced with another
implementation since the respective services are designed in a loosely coupled fashion.

Application is built using Spring-Boot. 

* Front-end: HTML view backed with AngularJS-based JavaScript file. Exposed over a different endpoint to backend. 
* Back-end API: Spring-based restful controllers 
* Back-end service: Spring annotated services to fetch weather update for the covered locations.

Running tests
------------------------------------
```
mvn clean compile test
```

Taking Test coverage
------------------------------------
Instantiate a sonar instance

```
docker-compose -f docker-compose-sonar.yml up
```
To send test results to sonar instance

```
mvn sonar:sonar
```
To view the test coverage

```
http://localhost:9000/dashboard?id=com.recruitment%3Aweatherforecast
```

To Build WAR :
------------------------------------
mvn package

Configuration Options
-------------------------
More locations could be added by specifying it as a comma separated value for the property "weather.cities" in application.properties. This requires a restart of the server.
