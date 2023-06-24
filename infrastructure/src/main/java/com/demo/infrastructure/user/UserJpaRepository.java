package com.demo.infrastructure.user;

import com.demo.domainuser.User;
import com.demo.domainuser.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJpaRepository implements UserRepository {

    private final IUserJpaRepository userRepository;

    public UserJpaRepository(IUserJpaRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findUser(String name, String password) {
        return userRepository.findUser(name, password);
    }

    @Override
    public List<User> findUsers() {
        return userRepository.findUsers();
    }

    @Override
    public User save(User user) {
        return userRepository.save(
                new UserEntity()
                        .fromDomainModel(user)
        ).toDomainModel();
    }
}
