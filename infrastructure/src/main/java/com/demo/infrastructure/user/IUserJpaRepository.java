package com.demo.infrastructure.user;

import com.demo.domainuser.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserJpaRepository extends JpaRepository<UserEntity, String> {
    public User findUser(String name, String password);
    public List<User> findUsers();
}
