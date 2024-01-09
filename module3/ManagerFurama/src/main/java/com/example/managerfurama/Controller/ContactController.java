package com.example.managerfurama.Controller;

import com.example.managerfurama.DAO.ContactDAO.ContactDAO;
import com.example.managerfurama.Model.Contact.Contact;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ContactController", value = "/contact")
public class ContactController extends HttpServlet {
    ContactDAO contactDAO;
    public void init(){
        contactDAO = new ContactDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":showInsert(req, resp);
                break;
            default:selectAll(req, resp);
        }

    }
    private void selectAll(HttpServletRequest request, HttpServletResponse response){
        List<Contact> contactList = contactDAO.selectAll();
        request.setAttribute("contactList", contactList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("contact/list.jsp");
        try {
            dispatcher.forward(request, response);
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
                try {
                    insert(req, resp);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                break;


        }

    }
    private void insert(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        String ngaylenhdStr = request.getParameter("ngaylenhopdong");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date ngaylenhd = dateFormat.parse(ngaylenhdStr);

        String ngayketthucStr = request.getParameter("ngayketthuchopdong");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
        Date ngayketthuc = dateFormat1.parse(ngayketthucStr);

        double tiendatcoc = Double.parseDouble(request.getParameter("tiendatcoc"));
        int manv = Integer.parseInt(request.getParameter("manhanvien"));
        int makh = Integer.parseInt(request.getParameter("makhachhang"));
        int madv = Integer.parseInt(request.getParameter("madichvu"));
        Contact contact = new Contact(0,ngaylenhd,ngayketthuc,tiendatcoc,manv,makh,madv);
        try{
            try {
                contactDAO.insert(contact);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact/create.jsp");
                requestDispatcher.forward(request,response);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


    }

    private void showInsert(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("contact/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
