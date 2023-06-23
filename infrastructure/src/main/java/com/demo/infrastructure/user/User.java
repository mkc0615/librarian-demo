package com.demo.infrastructure.user;

import com.demo.domainuser.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "user"
)
class UserEntity {
    private String id;
    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
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
        return User.create(id, name, password);
    }
}
