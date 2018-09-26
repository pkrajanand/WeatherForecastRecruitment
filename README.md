# Weather Forecaster (WeFor)
A light-weight weather reporting application based on OpenWeatherMap API.

This project is initiated while participating in an employment recruitment process in 2016. Later on, project is enhanced to try out new concepts and technologies.

## Development Environment

### System Requirement:
* JDK 1.8+  
* Gradle 4.0
* Docker

### Launching application:
* Backend: 

> ```
> cd backend
> gradle bootRun
> ```
 
* Frontend: 

> ```./start_frontend.sh```

### Accessing application:
* Backend: ```http://localhost:8080/```
* frontend: ```http://localhost:44000/```

### Running backend tests
```
cd backend
gradle clean test
```

### Taking Backend Test coverage
* Instantiate a sonar instance

>> ```
>> cd backend
>> docker-compose -f docker-compose-sonar.yml up
>> ```

* To send test results to sonar instance

> Need to fix the issues: 
>> (1) Gradle upgrade broke dockerization for Sonar Server #17
>> 
>> (2) Find Gradle plugin for Sonar integration #18
 
* To view the test coverage

> Need to fix the issues: 
>> (1) Gradle upgrade broke dockerization for Sonar Server #17
>> 
>> (2) Find Gradle plugin for Sonar integration #18

### Technology Stack
* Front-end: HTML, AngularJS 1.3, CSS, NodeJs Express
* Back-end: Spring Boot 2.0.5, JDK 8, Lombok
* SCM : GitHub
* Test Automation: JUnit 4, Mockito, Jacoco, Sonar, Docker(from https://github.com/mechero/code-quality-game)
* Build & Package : Gradle
* Dev Env Support: Spring-Boot embedded Tomcat
* Containerization: Docker

### Architectural Overview
Current implementation make use of a free service provided by Open Weather Map(http://openweathermap.org) for weather updates. But this could easily be replaced with another
implementation since the respective services are designed in a loosely coupled fashion.

Application is built using Spring-Boot. 

* Front-end: HTML view backed with AngularJS-based JavaScript file. Exposed over a different endpoint to backend. 
* Back-end API: Spring-based restful controllers 
* Back-end service: Spring annotated services to fetch weather update for the covered locations.

## Production deployment
> Need to fix the issues: 
>> (1) Design production strategy for backend #13
>> 
>> (2) Design production strategy for Frontend #12

## Configuration Options
The locations, for which weather updates could be displayed in the frontend, are now configurable through application.properties using a property "weather.cities". A change requires the restart of the server.
