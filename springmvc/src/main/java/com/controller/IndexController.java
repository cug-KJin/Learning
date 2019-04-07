package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Form")
public class IndexController {
    @RequestMapping("/show")
    public String index(){
        return "index";
    }
}