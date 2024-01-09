package com.example.manager_thuvien.Controller;

import com.example.manager_thuvien.Model.Sach;
import com.example.manager_thuvien.SachDAO.SachDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SachController", value = "/sach")
public class SachController extends HttpServlet {
  SachDAO sachDAO;
  public void init(){
      sachDAO = new SachDAO();
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

        List<Sach> sachList = sachDAO.selectAll();
        request.setAttribute("sachList",sachList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("sach/list.jsp");
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
