package com.example.thuvien.Controller;

import com.example.thuvien.DAO.SACH.MuonSach.MuonSachDAO;
import com.example.thuvien.Model.Themuonsach;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MuonsachServlet", value = "/muonsach")
public class MuonsachServlet extends HttpServlet {
    MuonSachDAO muonSachDAO;
    public void init(){
        muonSachDAO = new MuonSachDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action){

            case "muonsach": showMuonsach(req, resp);
            break;
//            default: selectDanhsachMuonSach(req, resp);
            case "danhsachmuonsach":
                selectDanhsachMuonSach(req, resp);
                break;

        }

    }
    private void selectDanhsachMuonSach(HttpServletRequest request, HttpServletResponse response){
        List<Themuonsach> themuonsachList = muonSachDAO.getDanhsachmuonsach();
        request.setAttribute("themuonsachList",themuonsachList);
RequestDispatcher requestDispatcher = request.getRequestDispatcher("muonsach/list.jsp");
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
        switch (action){
            case "muonsach": muonsach(req, resp);
            break;
        }

    }
    private void muonsach(HttpServletRequest request, HttpServletResponse response){
    int mamuonsach = Integer.parseInt(request.getParameter("mamuonsach"));
    int masach = Integer.parseInt(request.getParameter("masach"));
    String tensach = request.getParameter("tensach");
    int mahocsinnh = Integer.parseInt(request.getParameter("mahocsinh"));
    String hoten = request.getParameter("hoten");
    boolean trangthai = request.getParameter("trangthai").isEmpty();
    String ngaymuon = request.getParameter("ngaymuon");
    String ngaytra = request.getParameter("ngaytra");

        Themuonsach themuonsach = new Themuonsach(mamuonsach,masach,tensach,mahocsinnh,hoten,trangthai,ngaymuon,ngaytra);
        try{
            muonSachDAO.insert(themuonsach);
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("muonsach/muonsach.jsp");
            response.sendRedirect(request.getContextPath() + "/muonsach?action=danhsachmuonsach");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void showMuonsach(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("muonsach/muonsach.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
