package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class homeController{
    @RequestMapping("")
    public String showhome(){
        return "home";
    }
    @RequestMapping("/show")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("/home");
        String name = "Hello";
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
