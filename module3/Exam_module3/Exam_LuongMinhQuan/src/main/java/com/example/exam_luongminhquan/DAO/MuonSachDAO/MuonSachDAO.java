package com.example.exam_luongminhquan.DAO.MuonSachDAO;

import com.example.exam_luongminhquan.Model.Muonsach;
import com.example.exam_luongminhquan.Model.Sach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuonSachDAO implements  IMuonsach{
    private static final String SELECT_ALL = "SELECT * FROM THEMUONSACH";

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
    public List<Muonsach> selectAll() {
        List<Muonsach> muonsachList = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int mamuonsach =resultSet.getInt("mamuonsach");
               int masach = resultSet.getInt("masach");
               int mahocsinh = resultSet.getInt("mahocsinh");
               boolean trangthai = resultSet.getBoolean("trangthai");
               String ngaymuon = resultSet.getString("ngaymuon");
               String ngaytra = resultSet.getString("ngaytra");
               muonsachList.add(new Muonsach(mamuonsach,masach,mahocsinh,trangthai,ngaymuon,ngaytra));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return muonsachList;
    }
    }

