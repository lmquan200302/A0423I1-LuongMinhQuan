package com.example.furama.Controller;

import com.example.furama.DAO.NhanVien.NhanVienDAO;
import com.example.furama.Model.NhanVien.NhanVien;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "NhanvienServlet", value = "furama")
public class NhanvienServlet extends HttpServlet {
    NhanVienDAO nhanVienDAO;

    public void init() {
        nhanVienDAO = new NhanVienDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "listNhanVien": selectAllNhanVien(req, resp);
                break;
            default: selectAllNhanVien(req, resp);
            break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    // hien thi tat cac nhan vien
    private void selectAllNhanVien(HttpServletRequest request, HttpServletResponse response) {
        List<NhanVien> nhanVienList = nhanVienDAO.selectAllNhanVien();
        request.setAttribute("nhanVienList",nhanVienList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("furama/listNhanVien.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
