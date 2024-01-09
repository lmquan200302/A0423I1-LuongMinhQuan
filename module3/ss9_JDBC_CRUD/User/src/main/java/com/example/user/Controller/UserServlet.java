package com.example.user.Controller;

import com.example.user.DAO.UserDAO;
import com.example.user.Model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
    private UserDAO userDAO;
    public void init(){
        userDAO = new UserDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    if(action == null){
        action = "";
    }
        try {
            switch (action) {
                case "create": shownewForm(req,resp);
                    break;
                case "update": showUpdateForm(req, resp);
                    break;
                case "delete": deleteUsers(req, resp);
                case "findByName": findByName(req, resp);
                    break;
                case "findByCountry": findByCountry(req, resp);
                default:
                    userList(req, resp);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
    private void findByName(HttpServletRequest req, HttpServletResponse resp){
        List<User> userList = userDAO.finfAllByName(req.getParameter("nameSearch"));
        req.setAttribute("userList",userList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("user/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void findByCountry(HttpServletRequest request, HttpServletResponse response){
        List<User> userList = userDAO.findByCountry(request.getParameter("countrySearch"));
        request.setAttribute("userList",userList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void userList(HttpServletRequest req, HttpServletResponse resp){
        List<User> userList = userDAO.selectAllUser();
        req.setAttribute("userList",userList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("user/list.jsp");
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // post them 1 user

    private void shownewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
        dispatcher.forward(request,response);
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    User existingUser = userDAO.selectUser(id);
    RequestDispatcher dispatcher = request.getRequestDispatcher("user/edit.jsp");
    request.setAttribute("user",existingUser);
    dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getParameter("action");
    if(action == null){
        action = "";
    }
    try{
        switch (action){
            case "create": insertUser(req, resp);
            break;
            case "update": updateUser(req, resp);
            break;
        }
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
    private void insertUser(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User newuser = new User(0,name,email,country);
        try {
            userDAO.insertUser(newuser);
            RequestDispatcher dispatcher = request.getRequestDispatcher("user/create.jsp");
            dispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User user = new User(id,name,email,country);
        try {
            userDAO.updateUser(user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("user/edit.jsp");
            dispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void deleteUsers(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userDAO.deleteUsers(id);
        List<User> userList = userDAO.selectAllUser();
        request.setAttribute("userList",userList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
        dispatcher.forward(request,response);

    }
}
