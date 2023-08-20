package com.ivandjoh.myspringang.controller;

import com.ivandjoh.myspringang.model.User;
import com.ivandjoh.myspringang.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public ResponseEntity<List<User>> getAllUsers() {
        return userService.getAllUsers();
    }
}
