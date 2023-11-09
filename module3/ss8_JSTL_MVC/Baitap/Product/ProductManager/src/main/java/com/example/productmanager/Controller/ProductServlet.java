package com.example.productmanager.Controller;

import com.example.productmanager.Model.Product;
import com.example.productmanager.Service.ProductService;
import com.example.productmanager.Service.ProductServiceimpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
private static ProductService productService = new ProductServiceimpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(req, resp);
                break;
            case "edit":
                showEditForm(req, resp);
                break;
            case "delete": showDeleteForm(req, resp);
                break;
            case "view" : viewProduct(req, resp);
            default: listProduct(req, resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create": createProduct(req, resp);
                break;
            case "edit":  updateProduct(req, resp);
                break;
            case "delete": deleteProduct(req, resp);
                break;
            default:
            break;
        }
    }

    private void viewProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = req.getRequestDispatcher("product/404.jsp");
        }else{
            req.setAttribute("product",product);
            dispatcher = req.getRequestDispatcher("product/view.jsp");
        }
        try{
            dispatcher.forward(req,resp);
        }  catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void  listProduct(HttpServletRequest req, HttpServletResponse resp){
        List<Product> productList = productService.findAll();
        req.setAttribute("productList",productList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("product/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp){
        RequestDispatcher dispatcher = req.getRequestDispatcher("product/create.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createProduct(HttpServletRequest req, HttpServletResponse resp){
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String made = req.getParameter("made");
        double price = Double.parseDouble(req.getParameter("price"));

        Product product = new Product(id,name,made,price);
        this.productService.save(product);

        RequestDispatcher dispatcher = req.getRequestDispatcher("product/create.jsp");
        req.setAttribute("massege","Them moi san pham thanh cong");

        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
    private void showEditForm(HttpServletRequest req, HttpServletResponse resp){
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = req.getRequestDispatcher("product/404.jsp");
        }else {
            req.setAttribute("product",product);
            dispatcher = req.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void updateProduct(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String made = req.getParameter("made");
        double price = Double.parseDouble(req.getParameter("price"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = req.getRequestDispatcher("erro-404");
        }else {
            product.setId(id);
            product.setName(name);
            product.setMade(made);
            product.setPrice(price);
            productService.update(id,product);
            req.setAttribute("product",product);
            req.setAttribute("message","Sua san pham thanh cong");
            dispatcher = req.getRequestDispatcher("product/edit.jsp");
        }
        
            try {
                dispatcher.forward(req,resp);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
    private void showDeleteForm(HttpServletRequest req, HttpServletResponse resp){
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = req.getRequestDispatcher("product/404.jsp");
        }else {
            req.setAttribute("product",product);
            dispatcher = req.getRequestDispatcher("product/delete.jsp");
        }
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp){
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = req.getRequestDispatcher("product/404.jsp");
        }else {
            productService.remove(id);
        }
        try {
            resp.sendRedirect("/product");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
