package com.example.customer.controller;

import com.example.customer.Service.ICustomerService;
import com.example.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerRespo;

    @GetMapping
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Customer> customerList = customerRespo.findAll();
        modelAndView.addObject("customerList", customerList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(@ModelAttribute("customer") Customer customer) {
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("customer") Customer customer) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        customerRespo.save(customer);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showInfo(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("info");
        Customer customer = customerRespo.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
    @GetMapping("/{id}/delete")
    public ModelAndView showDelete(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        customerRespo.delete(id);
        return modelAndView;
    }

    @GetMapping("/{id}/edit")
    public ModelAndView showEdit(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("customer",customerRespo.findOne(id));
        return modelAndView;
    }
    @PostMapping("/update")
    public ModelAndView edit(@ModelAttribute("customer") Customer customer){
        ModelAndView modelAndView = new ModelAndView("redirect:/customer");
        customerRespo.save(customer);
        return modelAndView;
    }


}
