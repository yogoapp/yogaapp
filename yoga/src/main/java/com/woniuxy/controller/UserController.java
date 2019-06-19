package com.woniuxy.controller;

import com.woniuxy.pojo.User;
import com.woniuxy.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("getUsers")
    @RequiresRoles({"admin"})
    public String getUsers(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("user", users);
        return "main";
    }

    @GetMapping("getUser")
    @ResponseBody
    @RequiresRoles({"student"})
    @RequiresPermissions({"student:add"})
    public List<User> getUser() {
        return userService.getUsers();
    }

    @GetMapping("register")
    @ResponseBody
    public String register(User user) {
        user.setPassword(new SimpleHash("MD5", user.getPassword(), user.getAccount(), 1024).toString());
        userService.addUser(user);
        return "插入成功!";
    }

    @PostMapping("login")
    public String login(User user) {
        //获取主体对象
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(), user.getPassword());
            /*try {
                currentUser.login(token);
                System.out.println("认证成功");
                return "index";
            } catch (UnknownAccountException e) {
                System.out.println("账户不存在");
            } catch (IncorrectCredentialsException e) {
                System.out.println("密码错误");
            } catch (Exception e) {
                System.out.println("其它错误");
            }*/
            currentUser.login(token);
            System.out.println("认证成功");
        }
        return "index";
    }

}
