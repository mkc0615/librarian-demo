package com.demo.domainuser;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String name;
    private String password;
    private String phoneNumber;
    private String address;
    private String zipCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    private User(String name, String password, String phoneNumber, String address, String zipCode) {
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.zipCode = zipCode;
    }

    public static User create(String name, String password, String phoneNumber, String address, String zipCode){
        return new User(name, password, phoneNumber, address, zipCode);
    }

    public User searched() {
        return new User(name, password, phoneNumber, address, zipCode);
    }

    private User copy(String name, String password, String phoneNumber, String address, String zipCode){
        return new User(name, password, phoneNumber, address, zipCode);
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
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
