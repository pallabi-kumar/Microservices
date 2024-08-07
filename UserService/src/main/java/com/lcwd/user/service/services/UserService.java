package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
//UserService Interface

public interface UserService {
    // user operation

    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUser();
    //get single user of given userId
    User getUser(String userId);
    //delete a user
//    Void deleteUser(String userId);
//    //update a specific user
//    User updateUser(User, String userId);
}
