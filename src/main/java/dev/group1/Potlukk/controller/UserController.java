package dev.group1.Potlukk.controller;

import dev.group1.Potlukk.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
public class UserController {
    // Add new user
    @PostMapping("/users")
    @ResponseBody
    public User postUser(){
        return null;
    }

    // Get a user
    @GetMapping("/users/{id}")
    public User getUserByID(@PathVariable int id){
        return null;
    }

    // Update User
    @PutMapping("/users/{id}")
    @ResponseBody
    public User putUser(@PathVariable int id){
        return null;
    }

    // Remove a user
    @DeleteMapping("/users/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable int id){

    }
}
