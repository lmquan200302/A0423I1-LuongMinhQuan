package com.example.convert_money;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ConvertController {
    @RequestMapping("/")
    public String show(){
        return "index";
    }
    @PostMapping("/convert")
    public String convert(@RequestParam("vnd") float vnd,
                          @RequestParam("currency") String currency,
                          Model model){
        float ketqua;
        switch (currency){
            case "usd": ketqua = vnd / 23000;
            break;
            case "won": ketqua = vnd / 20000;
            break;
            default: ketqua = 0;
        }
        model.addAttribute("ketqua",ketqua);
        return "index";
    }

}
