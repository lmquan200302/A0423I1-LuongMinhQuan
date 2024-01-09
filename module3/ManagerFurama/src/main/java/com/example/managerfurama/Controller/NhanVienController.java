package com.example.managerfurama.Controller;

import com.example.managerfurama.DAO.NhanVienDAO.NhanVienDAO;
import com.example.managerfurama.Model.NhanVien.NhanVien;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "NhanVienController", value = "/nhanvien")
public class NhanVienController extends HttpServlet {
    private NhanVienDAO nhanVienDAO;
    public void init(){
        nhanVienDAO = new NhanVienDAO();
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "selectByName":
                try {
                    selectNhanVienByName(req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "create":showCreateNV(req, resp);
                break;
            case "update":showUpdate(req, resp);
                break;
            case "findByName":
                try {
                    selectNhanVienByName(req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "delete":
                try {
                    deleteNhanVien(req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            default: secletAllNhanVien(req, resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                try {
                    createNhanvien(req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "update": updateNhanVien(req, resp);
                break;
            case "findByName":
                try {
                    selectNhanVienByName(req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        }

    }
    private void createNhanvien(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int manhanvien = Integer.parseInt(request.getParameter("manhanvien"));
        String hoten = request.getParameter("hoten");
        String ngaysinh = request.getParameter("ngaysinh");
        String cccd = request.getParameter("cccd");
        Double luong = Double.valueOf(request.getParameter("luong"));
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diachi = request.getParameter("diachi");
        int mavitri = Integer.parseInt(request.getParameter("mavitri"));
        int matrinhdo = Integer.parseInt(request.getParameter("matrinhdo"));
        int mabophan = Integer.parseInt(request.getParameter("mabophan"));
NhanVien newNhanvien = new NhanVien(manhanvien,hoten,ngaysinh,cccd,luong,sdt,email,diachi,mavitri,matrinhdo,mabophan);
try{
nhanVienDAO.insertNhanvien(newNhanvien);
RequestDispatcher dispatcher = request.getRequestDispatcher("nhanvien/create.jsp");
dispatcher.forward(request,response);
} catch (SQLException e) {
    throw new RuntimeException(e);
} catch (ServletException e) {
    throw new RuntimeException(e);
} catch (IOException e) {
    throw new RuntimeException(e);
}
    }
    private void showCreateNV(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("nhanvien/create.jsp");
requestDispatcher.forward(request,response);

    }

    private void secletAllNhanVien(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<NhanVien> nhanVienList = nhanVienDAO.selectAllNhanVien();
        request.setAttribute("nhanVienList",nhanVienList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("nhanvien/listNhanVien.jsp");
        dispatcher.forward(request,response);
    }
    private void selectNhanVienByName(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        List<NhanVien> nhanVienList = nhanVienDAO.selectNameNhanVien(request.getParameter("nameSearch"));
        request.setAttribute("nhanVienList",nhanVienList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("nhanvien/listNhanVien.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void updateNhanVien(HttpServletRequest request, HttpServletResponse response){
        int manhanvien = Integer.parseInt(request.getParameter("manhanvien"));
        String hoten = request.getParameter("hoten");
        String ngaysinh = request.getParameter("ngaysinh");
        String cccd = request.getParameter("cccd");
        Double luong = Double.valueOf(request.getParameter("luong"));
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diachi = request.getParameter("diachi");
        int mavitri = Integer.parseInt(request.getParameter("mavitri"));
        int matrinhdo = Integer.parseInt(request.getParameter("matrinhdo"));
        int mabophan = Integer.parseInt(request.getParameter("mabophan"));
        NhanVien newNhanvien = new NhanVien(manhanvien,hoten,ngaysinh,cccd,luong,sdt,email,diachi,mavitri,matrinhdo,mabophan);
        try{
        nhanVienDAO.updateNV(newNhanvien);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("nhanvien/create.jsp");
        requestDispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int manhanvien = Integer.parseInt(request.getParameter("manhanvien"));
    NhanVien existingNV =nhanVienDAO.selectNhanVien(manhanvien);
RequestDispatcher requestDispatcher = request.getRequestDispatcher("nhanvien/update.jsp");
request.setAttribute("nhanvien",existingNV);
requestDispatcher.forward(request,response);

    }
    private void deleteNhanVien(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int manhanvien = Integer.parseInt(request.getParameter("manhanvien"));
        nhanVienDAO.deleteNhanvien(manhanvien);
        List<NhanVien> nhanVienList = nhanVienDAO.selectAllNhanVien();
        request.setAttribute("nhanVienList",nhanVienList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("nhanvien/listNhanVien.jsp");
        dispatcher.forward(request,response);

    }

}
