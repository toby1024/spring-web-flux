package com.example.springwebflux.controller;

import com.example.springwebflux.entity.User;
import com.example.springwebflux.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


/**
 * @program: springwebflux
 * @description: index
 * @author: Jason
 * @date: 2020-02-18 14:40
 **/
@RestController
@RequestMapping("")
@Slf4j
public class IndexController {
  @Autowired
  private UserService userRepository;

  @GetMapping("hello_world")
  public Mono<String> sayHelloWorld() {
    return Mono.just("Hello World");
  }

  @GetMapping("flux/users")
  public Mono<Iterable<User>> usersFlux() {
    log.info("=======>flux start");
    Mono<Iterable<User>> iterableMono = Mono.fromSupplier(() -> userRepository.findAll());
    log.info("=======>flux over");
    return iterableMono;
  }

  @GetMapping("mvc/users")
  public Iterable<User> users() {
    log.info("=======>mvc start");
    Iterable<User> all = userRepository.findAll();
    log.info("=======>mvc over");
    return all;
  }
}
