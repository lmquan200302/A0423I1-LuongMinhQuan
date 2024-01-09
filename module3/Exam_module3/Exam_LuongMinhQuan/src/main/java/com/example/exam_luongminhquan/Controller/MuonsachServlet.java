package com.example.exam_luongminhquan.Controller;

import com.example.exam_luongminhquan.DAO.MuonSachDAO.MuonSachDAO;
import com.example.exam_luongminhquan.Model.Muonsach;
import com.example.exam_luongminhquan.Model.Sach;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        if(action == null){
            action = "";
        }
        switch (action){
            case "muon":
                break;
            default:selectAll(req, resp);
                break;
        }

    }
    private void selectAll(HttpServletRequest request, HttpServletResponse response){
        List<Muonsach> muonsachList = muonSachDAO.selectAll();
        request.setAttribute("muonsachList",muonsachList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("muonsach/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
