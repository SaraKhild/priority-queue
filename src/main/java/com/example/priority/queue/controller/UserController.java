package com.example.priority.queue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.priority.queue.model.User;
import com.example.priority.queue.service.PriorityUserServcie;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/priority")
public class UserController {

    private PriorityUserServcie priorityUserServcie;

    @Autowired
    public UserController(PriorityUserServcie priorityUserServcie) {
        this.priorityUserServcie = priorityUserServcie;
    }

    @PostMapping
    public Mono<Void> addUser(@RequestBody User user) {

        return this.priorityUserServcie.addUser(user).then();

    }

    @GetMapping
    public Flux<User> getUsers() {

        return this.priorityUserServcie.getUsers();
        
    }

}
