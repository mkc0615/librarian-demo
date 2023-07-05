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
    private String phoneNumber;
    @Column
    private String address;
    @Column
    private String zipCode;
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
        this.phoneNumber = user.getPhoneNumber();
        this.address = user.getAddress();
        this.zipCode = user.getZipCode();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = null;
        this.deletedAt = null;
    }

    public User toDomainModel() {
        return User.create(name, password, phoneNumber, address, zipCode);
    }

    public UserEntity fromDomainModel(User user) {
        return new UserEntity(user);
    }
}
