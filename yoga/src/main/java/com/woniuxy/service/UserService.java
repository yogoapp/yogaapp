package com.woniuxy.service;


import com.woniuxy.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void addUser(User user);

    User findUserByAccount(String account);

    String getRole(String account);
}
