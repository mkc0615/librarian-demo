package com.demo.infrastructure.user;

import com.demo.domainuser.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserJpaRepository extends JpaRepository<UserEntity, String> {
    User findById(Long userId);
    UserEntity findUserByNameAndPassword(String name, String password);
    List<UserEntity> findAll();
}
