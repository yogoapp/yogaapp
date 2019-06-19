package com.woniuxy.dao;

import com.woniuxy.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select account,password from user")
    List<User> getUsers();

    @Insert("insert user(account,password) values(#{account},#{password})")
    void addUser(User user);

    @Select("select account,password from user where account=#{account}")
    User findUserByAccount(String account);

    @Select("select role from user inner join role on user.rid = role.rid where account=#{account}")
    String getRole(String account);
}
