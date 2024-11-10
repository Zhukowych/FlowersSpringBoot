package org.example.springflowerstore.controller;

import org.example.springflowerstore.service.FlowerService;
import org.example.springflowerstore.service.UserService;
import org.example.springflowerstore.user.AppUser;
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
    public List<AppUser> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("add_user/")
    public AppUser addUser(@RequestBody AppUser user) {
        return userService.createUser(user);
    }

}
