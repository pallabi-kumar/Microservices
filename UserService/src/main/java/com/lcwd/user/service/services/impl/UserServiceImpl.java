package com.lcwd.user.service.services.impl;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.exceptions.ResourceNotFoundException;

import com.lcwd.user.service.repositories.UserRepository;
import com.lcwd.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    //@Autowired
    //private HotelService hotelService;

    @Override
    public User saveUser(User user) {
        //Generate a unique userId
        String randomUserId=UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        //Get user from database with the help of user repository
        User user=userRepository.findById(userId)
                .orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server " +userId));
        //Fetching rating of the above user from RATING SERVICES
        //http://localhost:8081/users/aboc3457888

        return user;

    }

//    @Override
//    public Void deleteUser(String userId) {
//        return null;
//    }
//
//    @Override
//    public User updateUser(String userId) {
//        return null;
//    }
}
