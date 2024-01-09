package com.example.furama.DAO.NhanVien;

import com.example.furama.Model.NhanVien.NhanVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO implements INhanVien{
    private static final String URL = "Jdbc:mysql://localhost:3306/db_furama";
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
    public List<NhanVien> selectAllNhanVien() {
        String select_all_NhanVien = "SELECT * FROM nhan_vien";
    List<NhanVien> nhanVienList = new ArrayList<>();
    try {
    Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(select_all_NhanVien);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int manhanvien = resultSet.getInt("ma_nhan_vien");
            String hoten = resultSet.getString("ho_ten");
            String ngaysinh = resultSet.getString("ngay_sinh");
            String cccd = resultSet.getString("cccd");
            double luong = resultSet.getDouble("luong");
            String sdt = resultSet.getString("sdt");
            String email = resultSet.getString("email");
            String diachi = resultSet.getString("dia_chi");
            int matrinhdo = resultSet.getInt("ma_trinh_do");
            int mavitri = resultSet.getInt("ma_vi_tri");
            int mabophan = resultSet.getInt("ma_bo_phan");
            nhanVienList.add(new NhanVien(manhanvien,hoten,ngaysinh,cccd,luong,sdt,email,diachi,matrinhdo,mavitri,mabophan));

        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
        return nhanVienList;
    }
}
