package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.bean.User;

public interface UserService {

    void insertUser(User user);

    void deleteUser(int id);

    Map<String,Object> findUserById(Integer id);

    List<User> findAllUsers();

    void updateUser(User user);
}
