package com.example.thinclient.repository;

import com.example.thinclient.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    List<User> findAllByIdGreaterThan(String id);
}
