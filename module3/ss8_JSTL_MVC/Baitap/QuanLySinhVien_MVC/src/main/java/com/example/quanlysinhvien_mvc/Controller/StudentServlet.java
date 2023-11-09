package com.example.quanlysinhvien_mvc.Controller;

import com.example.quanlysinhvien_mvc.Model.Student;
import com.example.quanlysinhvien_mvc.Service.StudentService;
import com.example.quanlysinhvien_mvc.Service.StudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="StudentServlet", urlPatterns = "/students")

public class StudentServlet extends HttpServlet {
    private static StudentService studentService = new StudentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreate(req,resp);
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                listStudent(req,resp);
                break;

        }
    }

    private void showCreate(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("students/create.jsp");
        try{
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:

                break;

        }
    }

    private void listStudent(HttpServletRequest req, HttpServletResponse resp) {
        List<Student> students = studentService.findAll();
        req.setAttribute("students",students);
        RequestDispatcher RequestDispatcher = req.getRequestDispatcher("students/list.jsp");
        try {
            RequestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void createStudent(HttpServletRequest req, HttpServletResponse resp){
        Integer id = Integer.valueOf(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String grader = req.getParameter("grader");
        String address = req.getParameter("address");
        Float point = Float.valueOf(req.getParameter("point"));


        Student student = new Student(id,name,email,grader,address,point);
        studentService.save(student);
        req.setAttribute("message","create susseces");
        RequestDispatcher dispatcher = req.getRequestDispatcher("students/create.jsp");
        try {
            dispatcher.forward(req,resp);

        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
