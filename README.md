# Weather Forecaster (WeFor)
This is a weather forecast reporting application for selected cities. More cities could be added in a configurable way.

This was a project done as needed by employment recruitment process in 2016. However, it was a good opportunity to pick up Spring Boot.

------------------------------------
Architecture Stack
------------------------------------
* UI-Tier: HTML, AngularJS, CSS
* Middle Tier: Spring Boot 1.3.2, Spring MVC 4, JDK 8
* Test Automation: JUnit 4, Mockito
* Build Tool : Maven
* Deployment : Spring-Boot embedded Tomcat
* SCM : GitHub

---------------------------------
Development Environment
------------------------------------
* Mac OSX 10.11.3
* STS 3.7.2
* JDK 8
* Visual Paradigm Community Edition UML Tool

------------------------------------
System Requirement:
------------------------------------
* JDK 1.8+  
* MAVEN 3.3.9
* Application tested on Mac OSX 10.11.3  

------------------------------------
Architectural Overview
------------------------------------

The application follows three-tire architecture:

* client side: HTML page and AngularJS-based JavaScript file
* web tier: Restful controllers to collaborate between views and services
* service tier: Spring annotated services for loading the covered cities and for fetching the weather data for the selected city

Current implementation make use of a free service provided by Open Weather Map(http://openweathermap.org) for weather updates. But this could easily be replaced with another
implementation since the respective services are designed in a loosely coupled fashion.

Unit tests covers the core code regions.

Spring-Boot is used for quick turn around and to avail of an embedded Tomcat deployment.

------------------------------------
Design Diagrams
------------------------------------
Activity Diagrams - For User and System
![Image of Activity Diagram](doc/ActivityDiagramFromUserAndSystem.jpg)

Class Diagram - Around Service Classes
![Image of Class Diagram](doc/ClassDiagramsAroundServiceClasses.jpg)


------------------------------------
To run the tests
------------------------------------
```
mvn clean compile test
```
------------------------------------
To run this application:
------------------------------------
```
mvn spring-boot:run
```
------------------------------------
To access the application:
------------------------------------
http://localhost:8080/

------------------------------------
To Build WAR :
------------------------------------
mvn package

-------------------------
Configuration Options
-------------------------
More cities could be added by specifying it as a comma separated value for the property "weather.cities" in application.properties. This requires a restart of the server.
