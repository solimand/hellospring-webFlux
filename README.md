# hellospring-webFlux
A Spring WebFlux PoC

## Introduction/Background
- why spring webflux ...
- reactive streams ...
- Spring classes:
    - ```Mono```
    - ```WebClient```: has interesting features and can also be used in traditional Spring MVC applications.

## Run it
This project is based on Gradle. To run it you can use both:
- ```./gradlew bootRun``` (run it directly)
- ```./gradlew build``` to build the JAR, ```java -jar <path_to_jar>```
- The result is the print of ```>> message = Hello, Spring!``` in the std output. You can also check the resulting JSON from the page ```http://localhost:8080/hello```

## Test it
We tested the router class

## Dev Tools
- VSCode + Spring plugin
- Java 17

## References
1. [WebFlux Tutorial and GettingStart](https://spring.io/guides/gs/reactive-rest-service/)
1. [Spring Reactive docs](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
1. [Reactive Streams home](https://www.reactive-streams.org/)
