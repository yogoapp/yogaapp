package com.woniuxy.realm;

import com.woniuxy.pojo.User;
import com.woniuxy.service.UserService;
import com.woniuxy.utils.MySimpleByteSource;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {


    @Resource
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("正在授权!");
        //1.获取 token 中的信息
        String account = (String) principalCollection.getPrimaryPrincipal();
        //2.查询当前用户角色或者权限信息
        String role = userService.getRole(account);
        Set<String> roles = new HashSet<>();
        roles.add(role);

        Set<String> perms = new HashSet<>();
        perms.add("student:add");

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
        info.addStringPermissions(perms);

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("正在认证!");
        //获取账号
        String account = (String) authenticationToken.getPrincipal();
        //盐值
        ByteSource byteSource = ByteSource.Util.bytes(account.getBytes());
        MySimpleByteSource mySimpleByteSource = new MySimpleByteSource(byteSource);
        //查询
        User user = userService.findUserByAccount(account);
        if (user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user.getAccount(), user.getPassword(), mySimpleByteSource, getName());
    }
}
