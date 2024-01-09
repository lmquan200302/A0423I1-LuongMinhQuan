package com.example.managerfurama.Controller;

import com.example.managerfurama.DAO.KhachHangDAO.KhachHangDAO;
import com.example.managerfurama.Model.KhachHang.KhachHang;
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

@WebServlet(name = "KhachHangController", value = "/khachhang")
public class KhachHangController extends HttpServlet {
    KhachHangDAO khachHangDAO;
    public void init(){
        khachHangDAO = new KhachHangDAO();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "searchByName":
                    selectName(req, resp);
                break;


            case "create": showcreate(req,resp);
                break;


            case "update": showupdate(req,resp);
                break;
            case "delete": delete(req, resp);
            default: secletAll(req, resp);
            break;

            }
        }
        //ham hien thi danh sach
        private void secletAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<KhachHang> khachHangList = khachHangDAO.selectAll();
            request.setAttribute("khachHangList", khachHangList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("khachhang/list.jsp");
            dispatcher.forward(request, response);
        }

        // ham search theo ten
        private void selectName(HttpServletRequest request, HttpServletResponse response){
            List<KhachHang> khachHangList = null;
            try {
                khachHangList = khachHangDAO.selectName(request.getParameter("nameSearch"));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            request.setAttribute("khachHangList",khachHangList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("khachhang/list.jsp");
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
            action = "";
        }
        switch (action){
            case "create": create(req,resp);
            break;
            case "update": update(req, resp);
            break;
        }

    }
    // ham create post va get
    private void create(HttpServletRequest request, HttpServletResponse response){
        int maloaikhach = Integer.parseInt(request.getParameter("maloaikhach"));
        String hoten = request.getParameter("hoten");
        String ngaysinh = request.getParameter("ngaysinh");
        boolean gioitinh = request.getParameter("gioitinh").isEmpty();
        String cccd = request.getParameter("cccd");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diachi = request.getParameter("diachi");

        KhachHang khachHang = new KhachHang(0,maloaikhach,hoten,ngaysinh,gioitinh,cccd,sdt,email,diachi);
        try{
            khachHangDAO.insert(khachHang);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("khachhang/create.jsp");
            requestDispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void showcreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("khachhang/create.jsp");
        requestDispatcher.forward(request,response);
    }

    // HAM UPDATE post va get
    private void update(HttpServletRequest request, HttpServletResponse response){
        int makhachhang = Integer.parseInt(request.getParameter("makhachhang"));
        int maloaikhach = Integer.parseInt(request.getParameter("maloaikhach"));
        String hoten = request.getParameter("hoten");
        String ngaysinh = request.getParameter("ngaysinh");
        boolean gioitinh = request.getParameter("gioitinh").isEmpty();
        String cccd = request.getParameter("cccd");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String diachi = request.getParameter("diachi");

        KhachHang khachHang = new KhachHang(makhachhang,maloaikhach,hoten,ngaysinh,gioitinh,cccd,sdt,email,diachi);
        try{
            khachHangDAO.update(khachHang);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("khachhang/update.jsp");
            requestDispatcher.forward(request,response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showupdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int makhachhang = Integer.parseInt(request.getParameter("makhachhang"));
    KhachHang khachHang =khachHangDAO.selectmaKH(makhachhang);
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("khachhang/update.jsp");
    request.setAttribute("khachhang",khachHang);
    requestDispatcher.forward(request,response);

    }

    //ham delete
    private void delete(HttpServletRequest request, HttpServletResponse response){
        int makhachhang = Integer.parseInt(request.getParameter("makhachhang"));
        try {
            khachHangDAO.delete(makhachhang);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        List<KhachHang> khachHangList = khachHangDAO.selectAll();
        request.setAttribute("khachHangList",khachHangList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("khachhang/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
