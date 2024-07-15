package com.example.priority.queue.service;

import org.redisson.api.RScoredSortedSetReactive;
import org.redisson.api.RedissonReactiveClient;
import org.redisson.codec.TypedJsonJacksonCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.priority.queue.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PriorityUserServcie {

    private RScoredSortedSetReactive<User> sortedSet;

    @Autowired
    public PriorityUserServcie(RedissonReactiveClient client) {

        this.sortedSet = client.getScoredSortedSet("user", new TypedJsonJacksonCodec(User.class));

    }

    public Mono<Void> addUser(User user) {

        return this.sortedSet.add(user.getCategory().ordinal(), user)
                .doOnSuccess(success -> System.out.println("User added: " + success))
                .then();

    }

    public Flux<User> getUsers() {

        return sortedSet.readAll()
                .flatMapMany(Flux::fromIterable)
                .doOnNext(user -> System.out.println("Retrieved user: " + user));
                
    }

}
