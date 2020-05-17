package com.example.demo.infrastructure.redis;

import com.example.demo.NamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedisNamesRepository implements NamesRepository {

    public static final String ANY_KEY = "anyKey";

    private final PersonRepository personRepository;

    @Autowired
    public RedisNamesRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void save(String name) {
        personRepository.save(new Person(ANY_KEY, name));
    }

    @Override
    public String get() {
        return personRepository.findById(ANY_KEY).get().getName();
    }
}
