package com.example.furama.DAO;

import com.example.furama.Model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDAO implements ICustomer{
    private static final String URL = "Jdbc:mysql://localhost:3306/db_resort_furama";
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
    public List<com.example.furama.Model.Customer> selectAllCustomer() {
        String SELECT_ALL_CUSTOMER = "select * from khach_hang";
        List<Customer> customerList = new ArrayList<>();
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int MaKhachHang = resultSet.getInt("ma_khach_hang");
                int MaLoaiKhach = resultSet.getInt("ma_loai_khach");
                String HoTen = resultSet.getString("ho_ten");
                Date NgaySinh = resultSet.getDate("ngay_sinh");
                boolean GioiTinh = resultSet.getBoolean("gioi_tinh");
                String CCCD = resultSet.getString("cccd");
                String Phone = resultSet.getString("so_dien_thoai");
                String Email = resultSet.getString("email");
                String DiaChi = resultSet.getString("dia_chi");
                customerList.add(new Customer(MaKhachHang,MaLoaiKhach,HoTen,NgaySinh,GioiTinh,CCCD,Phone,Email,DiaChi));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }

    @Override
    public List<Customer> selectByName(String nameSearch){
    List<Customer> customerList = new ArrayList<>();
    String SELECT_BY_NAME = "SELECT * FROM KHACH_HANG WHERE ho_ten like BINARY ?";
    try{
    Connection connection = getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME);
    preparedStatement.setString(1,"%"+ nameSearch + "%");
    ResultSet resultSet = preparedStatement.executeQuery();

    while (resultSet.next()){
        Customer customer = new Customer();
        customer.setMaKhachHang(resultSet.getInt("ma_khach_hang"));
        customer.setMaLoaiKhach(resultSet.getInt("ma_loai_khach"));
        customer.setHoTen(resultSet.getString("ho_ten"));
        customer.setNgaySinh(resultSet.getDate("ngay_sinh"));
        customer.setGioiTinh(resultSet.getBoolean("gioi_tinh"));
        customer.setCCCD(resultSet.getString("cccd"));
        customer.setSDT(resultSet.getString("so_dien_thoai"));
        customer.setEmail(resultSet.getString("email"));
        customer.setDiaChi(resultSet.getString("dia_chi"));
        customerList.add(customer);
    }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
        return customerList;
    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        String INSERT_CUSTOMER_SQL = "INSERT INTO khach_hang (ma_khach_hang,ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,cccd,so_dien_thoai,email,dia_chi) value(?,?,?,?,?,?,?,?,?)";

    try{
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
        preparedStatement.setInt(1,customer.getMaKhachHang());
        preparedStatement.setInt(2,customer.getMaLoaiKhach());
        preparedStatement.setString(3,customer.getHoTen());
        java.sql.Date a = new java.sql.Date(customer.getNgaySinh().getTime());
//        java.sql.Date sqlDate = java.sql.Date.valueOf;
        preparedStatement.setDate(4, a);
        preparedStatement.setBoolean(5,customer.isGioiTinh());
        preparedStatement.setString(6,customer.getCCCD());
        preparedStatement.setString(7,customer.getSDT());
        preparedStatement.setString(8,customer.getEmail());
        preparedStatement.setString(9, customer.getDiaChi());
        preparedStatement.executeUpdate();




    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    }


}

