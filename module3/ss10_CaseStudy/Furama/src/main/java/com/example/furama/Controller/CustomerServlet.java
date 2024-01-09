package com.example.furama.Controller;

import com.example.furama.DAO.CustomerDAO;
import com.example.furama.Model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@WebServlet(name = "CustomerServlet", value = "/furama")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create": showInsertCustomer(req, resp);
                break;
            case "update":
                break;
            case "delete":
                break;
            case "selectByName":
                selectByName(req, resp);
                break;
            default: customerList(req,resp);
        }

    }
    private void selectByName(HttpServletRequest request, HttpServletResponse response){
        List<Customer> customerList = customerDAO.selectByName(request.getParameter("nameSearch"));
        request.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private CustomerDAO customerDAO;
    public void init(){
        customerDAO = new CustomerDAO();
    }
    // hien thi danh sach khach hang
    private void customerList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customerDAO.selectAllCustomer();
        request.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("furama/list.jsp");
        dispatcher.forward(request,response);
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
                    insertUser(req,resp);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }

        }
        }



    private void showInsertCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("furama/create.jsp");
    requestDispatcher.forward(request,response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        int ma_loai_khach = Integer.parseInt(request.getParameter("ma_loai_khach"));
        String ho_ten = request.getParameter("ho_ten");

        String ngay_sinh_str = request.getParameter("ngay_sinh");
        DateFormat format = new SimpleDateFormat(("yyyy/MM/dd"), Locale.ENGLISH);
        Date ngay_sinh = format.parse(ngay_sinh_str);

        Boolean gioi_tinh = request.getParameter("gioi_tinh").isEmpty();
        String cccd = request.getParameter("cccd");
        String so_dien_thoai = request.getParameter("so_dien_thoai");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");
        Customer newCustomer = new Customer(0,ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,cccd,so_dien_thoai,email,dia_chi);
        try {
        customerDAO.insertCustomer(newCustomer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("furama/create.jsp");
        requestDispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
