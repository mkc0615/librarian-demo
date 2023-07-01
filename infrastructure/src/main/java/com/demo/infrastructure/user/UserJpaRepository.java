package com.demo.infrastructure.user;

import com.demo.domainuser.User;
import com.demo.domainuser.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserJpaRepository implements UserRepository {

    private final IUserJpaRepository userRepository;

    public UserJpaRepository(IUserJpaRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByNameAndPassword(String name, String password) {
        return userRepository.findUserByNameAndPassword(name, password).toDomainModel();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public User save(User user) {
        return userRepository.save(
            new UserEntity()
                    .fromDomainModel(user)
        ).toDomainModel();
    }
}
