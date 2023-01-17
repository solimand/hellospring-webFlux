package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/* A simple handler to handle the request and create a response*/
@Component
public class GreetingHandler {

  /* the reactive code: a Mono object that holds a ServerResponse body.*/
  public Mono<ServerResponse> hello(ServerRequest request) {
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
      .body(BodyInserters.fromValue(new Greeting("Hello, Spring!")));
  }
}