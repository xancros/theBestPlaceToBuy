package com.TheBestPlaceToBuy.TheBestPlaceToBuy.controller;

import com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity.User;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.model.UserModel;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController (UserService userService){this.userService=userService;}

    @PostMapping(path = "/add")
    public int addUser(@RequestBody UserModel model){
        User u = new User();
        u.setName(model.getName());
        u.setEmail(model.getEmail());
        return userService.addUser(u);
    }

    @GetMapping(path = "/all")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
