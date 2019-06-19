package com.woniuxy.service.impl;

import com.woniuxy.dao.UserDao;
import com.woniuxy.pojo.User;
import com.woniuxy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User findUserByAccount(String account) {
        return userDao.findUserByAccount(account);
    }

    @Override
    public String getRole(String account) {
        return userDao.getRole(account);
    }
}
