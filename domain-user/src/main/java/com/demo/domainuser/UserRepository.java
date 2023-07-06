package com.demo.domainuser;

import java.util.List;

public interface UserRepository {
    User findById(Long id);
    List<User> findAll();
    User findUserByNameAndPassword(String name, String password);
    User save(User user);
}
