package com.example.springwebflux.service;

import com.example.springwebflux.entity.User;
import com.example.springwebflux.repository.UserRepository;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springwebflux
 * @description:
 * @author: Jason
 * @date: 2020-02-19 13:36
 **/
@Slf4j
@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  @SneakyThrows
  public Iterable<User> findAll() {
    log.info("find all users");
    Thread.sleep(5000L);
    return userRepository.findAll();
  }
}
