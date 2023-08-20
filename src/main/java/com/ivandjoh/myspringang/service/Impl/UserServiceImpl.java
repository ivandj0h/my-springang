package com.ivandjoh.myspringang.service.Impl;

import com.ivandjoh.myspringang.model.User;
import com.ivandjoh.myspringang.repository.UserRepository;
import com.ivandjoh.myspringang.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<List<User>> getAllUsers() {

        List<User> user = userRepository.findAll();
        return ResponseEntity.ok(user);
    }
}
