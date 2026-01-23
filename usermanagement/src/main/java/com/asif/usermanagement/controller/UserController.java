package com.asif.usermanagement.controller;

import com.asif.usermanagement.model.User;
import com.asif.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController //restapi
@RequestMapping("/api/users")
@CrossOrigin // all frontend to call backend
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;

    }
    @PostMapping // create user
    public User createUser(@RequestBody User user){ // json ->java object
        return userService.saveUser(user);
    }
    @GetMapping // fetch user
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

}
