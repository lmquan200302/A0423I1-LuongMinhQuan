package com.example.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TranslationServlet", value = "/transtion")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String [] array1 = {"hello","how","book","computer"};
    String [] array2 = {"Xin chao","The nao","Quyen vo","May tinh"};
        String search = req.getParameter("txtSearch");
        PrintWriter writer = resp.getWriter();


        for(int i=0; i< array1.length; i++){
        for(int j=0; j< array2.length; j++){
            if(search.equals(array1[i])){
                writer.println(array2[i]);
                break;

            }
        }
    }
        
    }
}
