package com.example.product.Controller;

import com.example.product.Model.Product;
import com.example.product.Respository.IProductRespo;
import com.example.product.Respository.ProductRespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductRespo productRespo;
    @GetMapping
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Product> productList = productRespo.findAll();
        modelAndView.addObject("productList",productList);
        return modelAndView;
    }
        @GetMapping("/add")
        public ModelAndView showAdd(@ModelAttribute("product") Product product){
            ModelAndView modelAndView = new ModelAndView("add");
            return modelAndView;
        }
    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute("product") Product product){
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        productRespo.save(product);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showInfo(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("info");
        Product product = productRespo.findOne(id);
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        productRespo.delete(id);
        return modelAndView;
    }
    @GetMapping("/{id}/edit")
    public ModelAndView showEdit(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("product",productRespo.findOne(id));
        return modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView edit(@ModelAttribute("product") Product product){
        ModelAndView modelAndView = new ModelAndView("redirect:/product");
        productRespo.save(product);
        return modelAndView;
    }
}
