package com.demo.domainuser;

import java.util.List;

public interface UserRepository {
    User findUserByNameAndPassword(String name, String password);
    List<User> findAll();
    User save(User user);
}
