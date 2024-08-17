package com.hrm.user.service.service;

import com.hrm.user.service.entity.User;

import java.util.List;

public interface UserService {
//    User Operations

//    Create
    User saveUser(User user);

//    Get All Users
    List<User> getAllUsers();

//    Get User By UserId
    User getUser(String userId);

}

