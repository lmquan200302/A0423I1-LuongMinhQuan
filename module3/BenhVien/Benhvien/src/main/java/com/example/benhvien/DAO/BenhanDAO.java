package com.example.benhvien.DAO;

import com.example.benhvien.Model.Benhan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BenhanDAO implements IBenhAn{

    private static final String URL = "Jdbc:mysql://localhost:3306/exam";
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
    private static final String SELECT_ALL = "SELECT * FROM BENHNHAN";
    private static final String UPDATE = "UPDATE BENHNHAN SET MABENHNHAN=?, TENBENHNHAN=?, NGAYNHAPVIEN=?, NGAYRAVIEN=?, LYDO=? WHERE MABENHAN=?";
    private static final String DELETE = "DELETE FROM BENHNHAN WHERE MABENHAN=?";
    @Override
    public List<Benhan> selectAll() {
        List<Benhan> benhanList = new ArrayList<>();

        try {
            Connection connection = getConnection(); // tao ket noi
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL); // tao cau truy van
            ResultSet resultSet = preparedStatement.executeQuery(); // tao bien result de luu cau truy van
            while (resultSet.next()){
                int mabenhan = resultSet.getInt("mabenhan");
                int mabenhnhan = resultSet.getInt("mabenhnhan");
                String tenbenhnhan = resultSet.getString("tenbenhnhan");
                String ngaynhapvien = resultSet.getString("ngaynhapvien");
                String ngayravien = resultSet.getString("ngayravien");
                String lydo = resultSet.getString("lydo");
                benhanList.add(new Benhan(mabenhan,mabenhnhan,tenbenhnhan,ngaynhapvien,ngayravien,lydo));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return benhanList ;
    }

    @Override
    public boolean update(Benhan benhan) throws SQLException {

        boolean rowUpdate;
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setInt(1, benhan.getMabenhan());
            preparedStatement.setString(2,benhan.getTenbenhnhan());
            preparedStatement.setString(3,benhan.getNgaynhapvien());
            preparedStatement.setString(4,benhan.getNgayravien());
            preparedStatement.setString(5,benhan.getLydo());
            preparedStatement.setInt(6,benhan.getMabenhan());

            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdate;
    }

    @Override
    public Benhan selectMabenhan(int mabenhan) {
        return null;
    }

    @Override
    public boolean delete(int mabenhan) throws SQLException {


        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE);) {
            statement.setInt(1,mabenhan);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;

    }

}
