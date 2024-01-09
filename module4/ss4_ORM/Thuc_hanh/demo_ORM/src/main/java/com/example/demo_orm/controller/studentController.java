package com.example.demo_orm.controller;

import com.example.demo_orm.Respository.IStudentResp;
import com.example.demo_orm.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.demo_orm.model.Student;
import com.example.demo_orm.Respository.IStudentResp;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/students")
@Controller
public class studentController {

    @Autowired
    private IStudentService service;
    public String showStudentList(Model model) {
            List<Student> studentList = new ArrayList<>();

                // Add the studentList to the model
                model.addAttribute("students", studentList);

        return "list";





}}

