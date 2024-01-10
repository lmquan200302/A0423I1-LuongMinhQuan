package com.example.tudien.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class TuDienController {
    @RequestMapping("/")
    public String showTuDien(){
        return "index";
    }
    @PostMapping("/find")
    public String tudien(@RequestParam("input") String input, Model model){
        String arrVN[] = {"mot","hai","ba"};
        String arrEng[] = {"one","two","three"};

        for(int i=0; i<arrVN.length; i++){
            if(input.equals(arrVN[i])){
                model.addAttribute("ketqua",arrEng[i]);
                return "index";
            }
        }
        model.addAttribute("ketqua","Khong tim thay tu");
        return "index";

}
}
