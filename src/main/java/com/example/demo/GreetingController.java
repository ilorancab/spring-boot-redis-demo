package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final NamesRepository namesRepository;

    @Autowired
    public GreetingController(NamesRepository namesRepository) {
        this.namesRepository = namesRepository;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name") String name) {
        namesRepository.save(name);
        return namesRepository.get();
    }
}
