package com.example.customer.Controller;

import com.example.customer.Model.Customer;
import com.example.customer.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class CustomerController {
    private CustomerServiceImpl customerService;
    @Autowired
    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }
    @RequestMapping("/")
    public String showList(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customerList",customerList);
        return "list";
    }


}
