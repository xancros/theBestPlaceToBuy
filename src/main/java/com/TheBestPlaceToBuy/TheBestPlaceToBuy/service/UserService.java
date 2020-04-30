package com.TheBestPlaceToBuy.TheBestPlaceToBuy.service;

import com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity.User;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository){this.userRepository=userRepository;}

    public int addUser(User user){
        userRepository.save(user);
        return 1;
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
}
