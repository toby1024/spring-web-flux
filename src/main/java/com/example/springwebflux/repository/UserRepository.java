package com.example.springwebflux.repository;

import com.example.springwebflux.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @program: springwebflux
 * @description: user dao
 * @author: Jason
 * @date: 2020-02-18 14:55
 **/
public interface UserRepository extends CrudRepository<User, Long> {
}
