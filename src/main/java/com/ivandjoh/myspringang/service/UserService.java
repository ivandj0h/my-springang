package com.ivandjoh.myspringang.service;

import com.ivandjoh.myspringang.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<User>> getAllUsers();
}
