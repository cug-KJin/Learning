package com.controller;
import com.dao.DAO;
import com.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Annotation;

@Controller
@RequestMapping("/Form")
public class loginincontroller implements Controller{
    @RequestMapping("/showloginin")
    public String index(){
        return "loginin";
    }
    @RequestMapping("/Adduser")
    public ModelAndView Adduser(@RequestParam("username")String username, @RequestParam("password")String password){
        user user = new user(username,password);
        DAO d = new DAO();
        ModelAndView m = new ModelAndView();

        if(d.Adduser(user)){
            m.addObject("用户注册成功",username);
            m.setViewName("loginup");
        }
        else{
            m.addObject("error","注册失败，该用户名已经被占用");
            m.setViewName("loginin");
        }
        return m;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
