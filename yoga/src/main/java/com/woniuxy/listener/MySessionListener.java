package com.woniuxy.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

public class MySessionListener implements SessionListener {
    @Override
    public void onStart(Session session) {
        System.out.println("session开启");
    }

    @Override
    public void onStop(Session session) {
        System.out.println("session关闭");

    }
    @Override
    public void onExpiration(Session session) {

    }
}
