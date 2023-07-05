package com.demo.infrastructure.user;

import com.demo.domainuser.User;
import com.demo.domainuser.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserJpaRepository implements UserRepository {

    private final IUserJpaRepository repository;

    public UserJpaRepository(IUserJpaRepository repository){
        this.repository = repository;
    }

    @Override
    public User findUserByNameAndPassword(String name, String password) {
        UserEntity result = repository.findUserByNameAndPassword(name, password);
        if (result != null) {
            return result.toDomainModel();
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll()
                .stream()
                .map(UserEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public User save(User user) {
        return repository.save(
            new UserEntity()
                    .fromDomainModel(user)
        ).toDomainModel();
    }
}
