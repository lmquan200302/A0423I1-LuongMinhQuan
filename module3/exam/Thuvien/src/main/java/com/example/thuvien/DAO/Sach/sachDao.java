package com.example.thuvien.DAO.Sach;

import com.example.thuvien.Model.sach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class sachDao implements iSach{
    private static final String SELECT_ALL = "SELECT * FROM SACH";

    private static final String URL = "Jdbc:mysql://localhost:3306/db";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";


    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Không thể kết nối đến cơ sở dữ liệu", e);
        }
    }

    @Override
    public List<sach> selectAll() {

        List<sach> sachList = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int masach =resultSet.getInt("masach");
                String tensach = resultSet.getString("tensach");
                String tacgia = resultSet.getString("tacgia");
                String mota = resultSet.getString("mota");
                int soluong = resultSet.getInt("soluong");
                sachList.add(new sach(masach,tensach,tacgia,mota,soluong));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return sachList;
    }
    }

