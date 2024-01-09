package com.example.thuvien.DAO.SACH.MuonSach;

import com.example.thuvien.Model.Themuonsach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MuonSachDAO implements IMuonSach{
    private static final String DANH_SACH_MUON_SACH = "SELECT * FROM THEMUONSACH";
    private static final String MUON_SACH = "INSERT INTO THEMUONSACH(MAMUONSACH,MASACH,TENSACH,MAHOCSINH,HOTEN,TRANGTHAI,NGAYMUON,NGAYTRA)VALUES (?,?,?,?,?,?,?,?)";
    private static final String URL = "jdbc:mysql://localhost:3306/thuvien";
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
    public List<Themuonsach> getDanhsachmuonsach() {
        List<Themuonsach> themuonsachList = new ArrayList<>();

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DANH_SACH_MUON_SACH);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int mamuonsach = resultSet.getInt("mamuonsach");
                int masach = resultSet.getInt("masach");
                String tensach = resultSet.getString("tensach");
                int mahocsinh = resultSet.getInt("mahocsinh");
                String hoten = resultSet.getString("hoten");
                boolean trangthai = resultSet.getBoolean("trangthai");
                String ngaymuon = resultSet.getString("ngaymuon");
                String ngaytra = resultSet.getString("ngaytra");
                themuonsachList.add(new Themuonsach(mamuonsach,masach,tensach,mahocsinh,hoten,trangthai,ngaymuon,ngaytra));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return themuonsachList;
    }

    @Override
    public void insert(Themuonsach themuonsach) throws SQLException {
    try{
Connection connection = getConnection();
PreparedStatement preparedStatement = connection.prepareStatement(MUON_SACH);
preparedStatement.setInt(1,themuonsach.getMamuonsach());
preparedStatement.setInt(2,themuonsach.getMasach());
preparedStatement.setString(3,themuonsach.getTensach());
preparedStatement.setInt(4,themuonsach.getMahocsinh());
preparedStatement.setString(5,themuonsach.getTenhocsinh());
preparedStatement.setBoolean(6,themuonsach.isTrangthai());
preparedStatement.setString(7,themuonsach.getNgaymuon());
preparedStatement.setString(8,themuonsach.getNgaytra());
preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    }

}
