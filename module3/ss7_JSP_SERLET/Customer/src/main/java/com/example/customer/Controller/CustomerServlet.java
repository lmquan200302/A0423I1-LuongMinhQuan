package com.example.customer.Controller;

import com.example.customer.Model.Customer;
import com.example.customer.Service.CustomerService;
import com.example.customer.Service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerService", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.findAll();
        req.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("customer/list.jsp");
        dispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Customer> customerList = customerService.findAll();
//        req.setAttribute("customerList",customerList);
//
//        //chuyen sang jsp
//        RequestDispatcher dispatcher = req.getRequestDispatcher("list.jsp");
//        dispatcher.forward(req,resp);
//
//    }
    }
    }


