package com.demo.domaincore.model;

import java.util.UUID;

public class UUIDGenerator {
    public static String generate(){
        return UUID.randomUUID().toString();
    }
}
