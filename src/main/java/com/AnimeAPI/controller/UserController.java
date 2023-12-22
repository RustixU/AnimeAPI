package com.AnimeAPI.controller;

import com.AnimeAPI.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserController {

    private List<User> userList = new ArrayList<>();

    public UserController() {
        this.userList.addAll(List.of(
                new User(1, "Рустам", "Авезов", 3)
        ));
    }

    @GetMapping("/user")
    Iterable<User> getUser() {
        return userList;
    }

    @GetMapping("/user/{id}")
    Optional<User> getUserById(@PathVariable int id) {
        for (User u : userList) {
            if (u.getId() == id) {
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }

    @PostMapping("/user")
    User postUser(@RequestBody User user) {
        userList.add(user);
        return user;
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable int id) {
        userList.removeIf(c -> c.getId() == id);
    }
}
