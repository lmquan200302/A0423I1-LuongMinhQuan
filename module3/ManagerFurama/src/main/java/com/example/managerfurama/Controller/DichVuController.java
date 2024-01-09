package com.example.managerfurama.Controller;

import com.example.managerfurama.DAO.DichVuDAO.DichVuDAO;
import com.example.managerfurama.Model.DichVu.DichVu;
import com.example.managerfurama.Model.KhachHang.KhachHang;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "DichVuController", value = "/dichvu")
public class DichVuController extends HttpServlet {
    DichVuDAO dichVuDAO;
    public void init(){
        dichVuDAO = new DichVuDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action ="";
        }
        switch (action){
            case "searchByName":searchByName(req, resp);
                break;
            case "create":showcreate(req, resp);
                break;
            case "update": showupdate(req, resp);
                break;
            case "delete": delete(req, resp);
                break;
            default: selectAll(req, resp);
            break;
        }

    }
    private void selectAll(HttpServletRequest request, HttpServletResponse response){
        List<DichVu> dichVuList = dichVuDAO.selectAll();
        request.setAttribute("dichVuList", dichVuList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("dichvu/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void searchByName(HttpServletRequest request, HttpServletResponse response){
        List<DichVu> dichVuList = null;
        try {
            dichVuList = dichVuDAO.selectName(request.getParameter("nameSearch"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("dichVuList",dichVuList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("dichvu/list.jsp");
        try{
            dispatcher.forward(request,response);
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
            action = null;
        }
        switch (action){
            case "create": create(req, resp);
                break;
            case "update": update(req, resp);
                break;
        }

    }
    private void create(HttpServletRequest request, HttpServletResponse response){
        String tendichvu = request.getParameter("tendichvu");
        int dientich = Integer.parseInt(request.getParameter("dientich"));
        double chiphi = Double.parseDouble(request.getParameter("chiphichothue"));
        int songuoitoidat = Integer.parseInt(request.getParameter("songuoitoidat"));
        int makieuthue = Integer.parseInt(request.getParameter("makieuthue"));
        int maloaidv = Integer.parseInt(request.getParameter("maloaidichvu"));
        String tieuchuan = request.getParameter("tieuchuanphong");
        String mota = request.getParameter("motatiennghikhac");
        double dientichhoboi = Double.parseDouble(request.getParameter("dientichhoboi"));
        int sotang = Integer.parseInt(request.getParameter("sotang"));

        DichVu dichVu = new DichVu(0,tendichvu,dientich,chiphi,songuoitoidat,makieuthue,maloaidv,tieuchuan,mota,dientichhoboi,sotang);


        try{
            dichVuDAO.insert(dichVu);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("dichvu/create.jsp");
            requestDispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    private void showcreate(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("dichvu/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //ham update
    private void update(HttpServletRequest request, HttpServletResponse response){
        int madichvu = Integer.parseInt(request.getParameter("madichvu"));
        String tendichvu = request.getParameter("tendichvu");
        int dientich = Integer.parseInt(request.getParameter("dientich"));
        double chiphi = Double.parseDouble(request.getParameter("chiphichothue"));
        int songuoitoidat = Integer.parseInt(request.getParameter("songuoitoidat"));
        int makieuthue = Integer.parseInt(request.getParameter("makieuthue"));
        int maloaidv = Integer.parseInt(request.getParameter("maloaidichvu"));
        String tieuchuan = request.getParameter("tieuchuanphong");
        String mota = request.getParameter("motatiennghikhac");
        double dientichhoboi = Double.parseDouble(request.getParameter("dientichhoboi"));
        int sotang = Integer.parseInt(request.getParameter("sotang"));
        DichVu dichVu = new DichVu(madichvu,tendichvu,dientich,chiphi,songuoitoidat,makieuthue,maloaidv,tieuchuan,mota,dientichhoboi,sotang);

        try{
            dichVuDAO.update(dichVu);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("dichvu/update.jsp");
            requestDispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void showupdate(HttpServletRequest request, HttpServletResponse response){
        int madichvu = Integer.parseInt(request.getParameter("madichvu"));
        DichVu dichVu =dichVuDAO.selectmaDV(madichvu);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("dichvu/update.jsp");
        request.setAttribute("dichvu",dichVu);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void delete(HttpServletRequest request, HttpServletResponse response){
        int madichvu = Integer.parseInt(request.getParameter("madichvu"));
        try {
            dichVuDAO.delete(madichvu);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        List<DichVu> dichVuList = dichVuDAO.selectAll();
        request.setAttribute("dichVuList",dichVuList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("dichvu/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }

