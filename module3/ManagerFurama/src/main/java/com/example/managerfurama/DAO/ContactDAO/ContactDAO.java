package com.example.managerfurama.DAO.ContactDAO;

import com.example.managerfurama.Model.Contact.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactDAO implements IContact {
    private static final String SELECT_ALL = "SELECT * FROM HOP_DONG";
    private static final String INSERT = "INSERT INTO HOP_DONG(NGAY_LEN_HOP_DONG,NGAY_KET_THUC,TIEN_DAT_COC,MA_NHAN_VIEN,MA_KHACH_HANG,MA_DICH_VU)VALUES (?,?,?,?,?,?)";
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
    public List<Contact> selectAll() {
        List<Contact> contactList = new ArrayList<>(); // tao list
        try {
            Connection connection = getConnection(); // tao ket noi
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL); // tao cau truy van
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int mahopdong = resultSet.getInt("ma_hop_dong");
                Date ngaylen = resultSet.getDate("ngay_len_hop_dong");
                Date ngayketthuc = resultSet.getDate("ngay_ket_thuc");
                double tiendatcoc = resultSet.getDouble("tien_dat_coc");
                int manv = resultSet.getInt("ma_nhan_vien");
                int makh = resultSet.getInt("ma_khach_hang");
                int madv = resultSet.getInt("ma_dich_vu");
                contactList.add(new Contact(mahopdong, ngaylen, ngayketthuc, tiendatcoc, manv, makh, madv));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contactList;
    }

    @Override
    public void insert(Contact contact) throws SQLException {
        try{
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setDate(1, (java.sql.Date) contact.getNgaylenhopdong());
            statement.setDate(2, (java.sql.Date) contact.getNgayketthuchopdong());
            statement.setDouble(3,contact.getTiendatcoc());
            statement.setInt(4,contact.getManhanvien());
            statement.setInt(5,contact.getMakhachhang());
            statement.setInt(6,contact.getMadichvu());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
