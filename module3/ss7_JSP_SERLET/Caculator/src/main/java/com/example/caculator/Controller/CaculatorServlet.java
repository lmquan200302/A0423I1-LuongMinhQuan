package com.example.caculator.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculatorServlet", value = "/CaculatorServlet")
public class CaculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));

        double cong = num1 + num2;
        double tru = num1 - num2;
        double nhan = num1 * num2;
        double chia = num1 / num2;

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h3>ket qua =" + cong + "</h3>");
        printWriter.println("<h3>ket qua =" + tru + "</h3>");
        printWriter.println("<h3>ket qua =" + nhan + "</h3>");
        printWriter.println("<h3>ket qua =" + chia + "</h3>");
        printWriter.println("</html>");










    }
}
