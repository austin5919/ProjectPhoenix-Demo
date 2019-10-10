package me.austin5919.projectphoenixdemo.repository;

import me.austin5919.projectphoenixdemo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long> {
  Users findByUserId(Long userId);
}
