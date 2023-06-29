package com.demo.domainuser;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    private User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static User create(String name, String password){
        return new User(name, password);
    }

    public User searched() {
        return new User(name, password);
    }

    private User copy(String name, String password){
        return new User(name, password);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }
}
