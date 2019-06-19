package com.woniuxy.filter;

import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ShiroException.class)
    public ModelAndView defaultExceptionHandler(ShiroException e) {
        ModelAndView modelAndView = new ModelAndView();
        Result result = null;
        if (e instanceof UnknownAccountException) {
            result = new Result(ResultStatusCode.BAD_REQUEST, "账户不存在");
        } else if (e instanceof UnauthorizedException) {
            result = new Result(ResultStatusCode.SYSTEM_ERR, "未授权");
            modelAndView.addObject("result", result);
            modelAndView.setViewName("error");
            return modelAndView;
        }
        modelAndView.addObject("result", result);
        modelAndView.setViewName("login");
        return modelAndView;
    }

}
