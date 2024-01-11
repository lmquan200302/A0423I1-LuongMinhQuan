package com.example.cauhinhhomthu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller

public class MailC {
    @RequestMapping("/")
    public String show(){
        return "home";
    }
    @PostMapping("/setting")
    public String setting(@RequestParam("Language") String Laguage[],
                          @RequestParam("Pagesize") String Pagesize[],
                          @RequestParam("Signature") String Signature,
                          @RequestParam(value = "Spams", defaultValue = "False") boolean Spams,
                          Model model){
        model.addAttribute("Language", Arrays.asList(Laguage));
        model.addAttribute("Pagesize",Arrays.asList(Pagesize));
        model.addAttribute("Signature",Signature);
        model.addAttribute("Spams",Spams);
        return "info";
    }
}
