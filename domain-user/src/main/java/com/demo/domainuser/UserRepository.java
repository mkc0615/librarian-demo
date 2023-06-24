package com.demo.domainuser;

import java.util.List;

public interface UserRepository {
    User findUser(String name, String password);
    List<User> findUsers();
    User save(User user);
}
