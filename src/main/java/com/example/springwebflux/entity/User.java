package com.example.springwebflux.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @program: springwebflux
 * @description: user
 * @author: Jason
 * @date: 2020-02-18 14:55
 **/
@Data
@Entity(name = "user")
public class User {

  @Id
  private Long id;
  private String name;
}
