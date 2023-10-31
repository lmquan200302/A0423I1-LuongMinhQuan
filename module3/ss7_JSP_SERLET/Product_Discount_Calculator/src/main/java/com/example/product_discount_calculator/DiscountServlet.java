package com.example.product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productDescription = req.getParameter("Product_Description");
        float listPrice = Float.parseFloat(req.getParameter("List_Price"));
        float discountPercent = Float.parseFloat(req.getParameter("Discount_Percent"));
        float discountAmount = (float) (listPrice * discountPercent * 0.01);
        float discountPrice = listPrice - discountAmount;

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h3>Mo ta san pham " + productDescription + "</h3>");
        printWriter.write("<h3>Chiet khau: " + discountAmount + "</h3>");
        printWriter.write("<h3>Gia san pham sau chiet khau la: " + discountPrice + "</h3>");
        printWriter.println("<html>");



    }
}
