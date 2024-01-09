package com.example.benhvien.Controller;

import com.example.benhvien.DAO.BenhanDAO;
import com.example.benhvien.Model.Benhan;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhanServlet", value = "/benhan")
public class BenhanServlet extends HttpServlet {
    BenhanDAO benhanDAO;

    public void init() {
        benhanDAO = new BenhanDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "update":
                showUpdate(req, resp);
                break;
            case "delete":
                try {
                    delete(req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                selectAllBenhAn(req, resp);
                break;
        }


    }

    private void selectAllBenhAn(HttpServletRequest request, HttpServletResponse response) {

        List<Benhan> benhanList = benhanDAO.selectAll();
        request.setAttribute("benhanList", benhanList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("benhan/list.jsp");
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
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "update":
                update(req, resp);
                break;
            case "delete":
                break;
        }

    }

    private void update(HttpServletRequest request, HttpServletResponse response) {

        int mabenhan = Integer.parseInt(request.getParameter("mabenhan"));
        int mabenhnhan = Integer.parseInt(request.getParameter("mabenhnhan"));
        String tenbenhnhan = request.getParameter("tenbenhnhan");
        String ngaynhapvien = request.getParameter("ngaynhapvien");
        String ngayravien = request.getParameter("ngayravien");
        String lydo = request.getParameter("lydo");
        Benhan benhan = new Benhan(mabenhan, mabenhnhan, tenbenhnhan, ngaynhapvien, ngayravien, lydo);
        try {
            benhanDAO.update(benhan);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhan/update.jsp");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) {
        int mabenhan = Integer.parseInt(request.getParameter("mabenhan"));
        Benhan benhan = benhanDAO.selectMabenhan(mabenhan);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhan/update.jsp");
        request.setAttribute("benhan", benhan);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int mabenhan = Integer.parseInt(request.getParameter("mabenhan"));
        benhanDAO.delete(mabenhan);
        List<Benhan> benhanList = benhanDAO.selectAll();
        request.setAttribute("benhanList",benhanList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("benhan/list.jsp");
        dispatcher.forward(request,response);
    }
}
