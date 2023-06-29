package com.demo.infrastructure.user;

import com.demo.domainuser.User;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "user"
)
class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
    @Column
    private LocalDateTime deletedAt;

    public UserEntity() { }

    public UserEntity(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.password = user.getPassword();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = null;
        this.deletedAt = null;
    }

    public User toDomainModel() {
        return User.create(name, password);
    }

    public UserEntity fromDomainModel(User user) {
        return new UserEntity(user);
    }
}
