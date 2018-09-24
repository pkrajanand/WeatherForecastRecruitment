# Weather Forecaster (WeFor)
This is a light-weight weather reporting application for selected locations. More locations could be added in a configurable way. It makes use of API from OpenWeatherMap.

This project is initially done as needed by employment recruitment process in 2016. Later on, I used this project to try out new concepts and technologies.

Technology Stack
------------------------------------
* Front-end: HTML, AngularJS 1.3, CSS
* Back-end: Spring Boot 2.0.5, JDK 8, Lombok
* Test Automation: JUnit 4, Mockito, Jacoco, Sonar, Docker(from https://github.com/mechero/code-quality-game)
* Build & Package : Maven
* SCM : GitHub
* Dev Env Support: Spring-Boot embedded Tomcat, STS 3.9.4, Mac OSX 10.13.6 

System Requirement:
------------------------------------
* JDK 1.8+  
* MAVEN 3.3.9
* Lombok 

Architectural Overview
------------------------------------

* Front-end: HTML view backed with AngularJS-based JavaScript file
* Back-end api: Spring-based restful controllers 
* Back-end service: Spring annotated services for loading the covered cities and for fetching the weather data for the selected city

Current implementation make use of a free service provided by Open Weather Map(http://openweathermap.org) for weather updates. But this could easily be replaced with another
implementation since the respective services are designed in a loosely coupled fashion.

Unit tests covers the core code regions.

Spring-Boot is used for quick turn around and to avail of an embedded Tomcat deployment.

Design Diagrams
------------------------------------
Activity Diagrams - For User and System
![Image of Activity Diagram](doc/ActivityDiagramFromUserAndSystem.jpg)

Class Diagram - Around Service Classes
![Image of Class Diagram](doc/ClassDiagramsAroundServiceClasses.jpg)

To run the tests
------------------------------------
```
mvn clean compile test
```

Test coverage
------------------------------------
To instantiate a sonar instance

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

To run this application:
------------------------------------
```
mvn spring-boot:run
```

To access the application:
------------------------------------
http://localhost:8080/

To Build WAR :
------------------------------------
mvn package

Configuration Options
-------------------------
More cities could be added by specifying it as a comma separated value for the property "weather.cities" in application.properties. This requires a restart of the server.
