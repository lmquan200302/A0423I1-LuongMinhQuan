package com.example.email_validate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;

@Controller

public class EmailController {
    static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    @GetMapping("/")
    public String showHome(){
        return "index";
    }
    @PostMapping("/validate")
    public String validateEmail(@RequestParam("email") String email, Model model){
        if(email.matches(REGEX_EMAIL)){
            model.addAttribute("Result", email);
        }else {
            model.addAttribute("Result","Email khong hop le");
        }
        return "index";
    }
}
