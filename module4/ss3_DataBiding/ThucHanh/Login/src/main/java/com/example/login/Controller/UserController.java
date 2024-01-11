package com.example.login.Controller;

import com.example.login.DAO.UserDAO;
import com.example.login.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {
    @RequestMapping("/")
    public String show(){
        return "index";
    }
    @PostMapping("/checkLogin")
    public String checkLogin(Model model){
        for(UserDAO u : userList)

    }
}
