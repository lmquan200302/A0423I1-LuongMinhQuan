package com.example.managerfurama.DAO.Contact_detailDAO;

import com.example.managerfurama.Model.Contact_detail.Contact_detail;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Contact_deltaiDAO implements IContact_detail{
    private static final String INSERT = "INSERT INTO HOP_DONG_CHI_TIET(MA_HOP_DONG,MA_DICH_VU_DI_KEM,SO_LUONG)VALUES (?,?,?)";
    private static final String SELECT_ALL = "SELECT * FROM HOP_DONG_CHI_TIET";
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
    public List<Contact_detail> selectAll() {
        List<Contact_detail> contact_detailList = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int mahdchitiet = resultSet.getInt("ma_hop_dong_chi_tiet");
                int mahd = resultSet.getInt("ma_hop_dong");
                int madvdk = resultSet.getInt("ma_dich_vu_di_kem");
                int soluong = resultSet.getInt("so_luong");
                contact_detailList.add(new Contact_detail(mahdchitiet,mahd,madvdk,soluong));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contact_detailList;
    }

    @Override
    public void insert(Contact_detail contactDetail) throws SQLException {
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setInt(1,contactDetail.getMahd());
            preparedStatement.setInt(2,contactDetail.getMadvdikem());
            preparedStatement.setInt(3,contactDetail.getSoluong());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
