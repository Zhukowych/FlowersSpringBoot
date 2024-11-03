package org.example.springflowerstore.controller;

import org.example.springflowerstore.flower.Flower;
import org.example.springflowerstore.service.FlowerService;
import org.example.springflowerstore.service.UserService;
import org.example.springflowerstore.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService, FlowerService flowerService) {
        this.userService = userService;
    }

    @GetMapping("users/")
    public List<User> getFlowers() {
        return userService.getAllUsers();
    }

    @PostMapping("add_user/")
    public User addFlower(@RequestBody User user) {
        return userService.createUser(user);
    }

}
