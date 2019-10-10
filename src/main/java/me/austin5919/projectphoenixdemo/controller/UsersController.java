package me.austin5919.projectphoenixdemo.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import me.austin5919.projectphoenixdemo.model.Users;
import me.austin5919.projectphoenixdemo.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

  @Autowired private UserJpaRepository userJpaRepository;

  @GetMapping("/all")
  public List<Users> findAll() {
    return userJpaRepository.findAll();
  }

  @GetMapping("/{userId}")
  public Users findById(@PathVariable final Long userId) {
    return userJpaRepository.findByUserId(userId);
  }

  @PostMapping("/register")
  public Users register(@RequestBody final Users users) {
    users.setAdmin(false);
    users.setJoinDate(new Timestamp(new Date().getTime()));
    users.setLastOnline(null);
    userJpaRepository.save(users);
    return userJpaRepository.findByUserId(users.getUserId());
  }
}
