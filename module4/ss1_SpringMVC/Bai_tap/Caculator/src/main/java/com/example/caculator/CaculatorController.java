package com.example.caculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CaculatorController {
    @RequestMapping("/")
    public String showCaculator(){
        return "index";
    }
@PostMapping("calculator")
    public String calculator(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam("operation") String operation,
                            Model model)
                            {
                                int ketqua;

                                switch (operation){
                                    case "cong": ketqua = num1 + num2;
                                    break;
                                    case "tru": ketqua = num1 - num2;
                                    break;
                                    case "nhan": ketqua = num1 * num2;
                                    break;
                                    case "chia": ketqua = num1 / num2;
                                    break;
                                    default: ketqua = 0;
                                }
                                model.addAttribute("ketqua",ketqua);
                                return "index";
}
}
