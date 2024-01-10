package com.example.giavisalad.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller

public class GiaViController {
    @RequestMapping("/")
    public String show(){
        return "index";
    }
    @PostMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("Result", Arrays.asList(condiment));
        return "index";
    }

}
