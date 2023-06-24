package com.demo.domainuser;

import java.time.LocalDateTime;

public class User {
    private String id;
    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    private User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public static User create(String id, String name, String password){
        return new User(id, name, password);
    }

    public User searched() {
        return new User(id, name, password);
    }

    private User copy(String id, String name, String password){
        return new User(id, name, password);
    }

    public String getId() {
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
