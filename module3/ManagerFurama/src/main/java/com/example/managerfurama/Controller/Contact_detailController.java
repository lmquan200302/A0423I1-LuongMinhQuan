package com.example.managerfurama.Controller;

import com.example.managerfurama.DAO.Contact_detailDAO.Contact_deltaiDAO;
import com.example.managerfurama.Model.Contact_detail.Contact_detail;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "Contact_detailController", value = "/contact_detail")
public class Contact_detailController extends HttpServlet {
    Contact_deltaiDAO contactDeltaiDAO;
    public void init(){
        contactDeltaiDAO = new Contact_deltaiDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create": showcreate(req, resp);
                break;
            default:selectAll(req, resp);
        }

    }
    private void selectAll(HttpServletRequest request, HttpServletResponse response){
        List<Contact_detail> contact_detailList = contactDeltaiDAO.selectAll();
        request.setAttribute("contact_detailList",contact_detailList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact_detail/list.jsp");
        try {
            requestDispatcher.forward(request,response);
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
            case "create": create(req, resp);
                break;
        }

    }
    private void create(HttpServletRequest request, HttpServletResponse response){
        int mahd = Integer.parseInt(request.getParameter("mahopdong"));
        int madvdikem = Integer.parseInt(request.getParameter("madichvudikem"));
        int soluong = Integer.parseInt(request.getParameter("soluong"));
        Contact_detail contactDetail = new Contact_detail(0,mahd,madvdikem,soluong);
        try{
            contactDeltaiDAO.insert(contactDetail);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact_detail/create.jsp");
            try {
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void showcreate(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact_detail/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
