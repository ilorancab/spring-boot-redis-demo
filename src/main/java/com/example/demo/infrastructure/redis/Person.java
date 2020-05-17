package com.example.demo.infrastructure.redis;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash
public class Person implements Serializable {
    private final String id;
    private final String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
