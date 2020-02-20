package com.example.springwebflux.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @program: springwebflux
 * @description:
 * @author: Jason
 * @date: 2020-02-19 13:50
 **/
@RestController
@RequestMapping("/flux")
public class ServerSendController {

  @GetMapping(value = "send", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  private Flux<String> flux() {
    Flux<String> result = Flux
        .fromStream(IntStream.range(1, 30).mapToObj(i -> {
          try {
            TimeUnit.SECONDS.sleep(1);
          } catch (InterruptedException e) {
          }
          return "send flux data--" + i;
        }));
    return result;
  }
}
