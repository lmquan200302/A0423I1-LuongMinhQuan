package com.example.managerfurama.DAO.KhachHangDAO;

import com.example.managerfurama.Model.KhachHang.KhachHang;
import com.example.managerfurama.Model.NhanVien.NhanVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO implements IKhachHang{

    private static final String SELECT_ALL = "SELECT * FROM KHACH_HANG";
    private static final String SELECT_NAME = "SELECT * FROM KHACH_HANG WHERE HO_TEN=?";
    private static final String INSERT = "INSERT INTO KHACH_HANG(MA_LOAI_KHACH,HO_TEN,NGAY_SINH,GIOI_TINH,CCCD,SDT,EMAIL,DIA_CHI)VALUES (?,?,?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE KHACH_HANG SET MA_LOAI_KHACH=?, HO_TEN=?, NGAY_SINH=?, GIOI_TINH=?, CCCD=?, SDT=?, EMAIL=?,  DIA_CHI=? WHERE MA_KHACH_HANG=?";
    private static final String SELECT_MAKH = "SELECT * FROM KHACH_HANG WHERE MA_KHACH_HANG=?";
    private static final String DELETE = "DELETE FROM KHACH_HANG WHERE MA_KHACH_HANG=?";

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
    public List<KhachHang> selectAll() {
        List<KhachHang> khachHangList = new ArrayList<>(); // tao list
        try {
            Connection connection = getConnection(); // tao ket noi
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL); // tao cau truy van
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int makh = resultSet.getInt("ma_khach_hang");
                int maloaikhach = resultSet.getInt("ma_loai_khach");
                String hoten = resultSet.getString("ho_ten");
                String ngaysinh = resultSet.getString("ngay_sinh");
                boolean gioitinh = resultSet.getBoolean("gioi_tinh");
                String cccd = resultSet.getString("cccd");
                String sdt = resultSet.getString("sdt");
                String email = resultSet.getString("email");
                String diachi = resultSet.getString("dia_chi");
                khachHangList.add(new KhachHang(makh,maloaikhach,hoten,ngaysinh,gioitinh,cccd,sdt,email,diachi));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return khachHangList;
    }

    @Override
    public List<KhachHang>selectName(String nameSearch) throws SQLException {


        List<KhachHang> khachHangList =new ArrayList<>();
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NAME);
            preparedStatement.setString(1,nameSearch);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                KhachHang khachHang = new KhachHang();
                khachHang.setMakhachhang(resultSet.getInt("ma_khach_hang"));
                khachHang.setMaloaikhach(resultSet.getInt("ma_loai_khach"));
                khachHang.setHoten(resultSet.getString("ho_ten"));
                khachHang.setNgaysinh(resultSet.getString("ngay_sinh"));
                khachHang.setGioitinh(resultSet.getBoolean("gioi_tinh"));
                khachHang.setCccd(resultSet.getString("cccd"));
                khachHang.setSdt(resultSet.getString("sdt"));
                khachHang.setEmail(resultSet.getString("email"));
                khachHang.setDiachi(resultSet.getString("dia_chi"));

                khachHangList.add(khachHang);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return khachHangList;
    }

    @Override
    public void insert(KhachHang khachHang) throws SQLException {
        try{
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setInt(1,khachHang.getMaloaikhach());
            statement.setString(2,khachHang.getHoten());
            statement.setString(3,khachHang.getNgaysinh());
            statement.setBoolean(4,khachHang.getGioitinh());
            statement.setString(5,khachHang.getCccd());
            statement.setString(6,khachHang.getSdt());
            statement.setString(7,khachHang.getEmail());
            statement.setString(8,khachHang.getDiachi());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public boolean update(KhachHang khachHang) throws SQLException {

        boolean rowUpdate;
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setInt(1, khachHang.getMaloaikhach());
            preparedStatement.setString(2, khachHang.getHoten());
            preparedStatement.setString(3, khachHang.getNgaysinh());
            preparedStatement.setBoolean(4, khachHang.getGioitinh());
            preparedStatement.setString(5, khachHang.getCccd());
            preparedStatement.setString(6, khachHang.getSdt());
            preparedStatement.setString(7, khachHang.getEmail());
            preparedStatement.setString(8, khachHang.getDiachi());
            preparedStatement.setInt(9, khachHang.getMakhachhang()); // Chuyển cột 'ma_nhan_vien' xuống đây

            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdate;
    }

    @Override
    public KhachHang selectmaKH(int makhachhang) {
        return null;
    }

    @Override
    public boolean delete(int makhachhang) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE);) {
            statement.setInt(1,makhachhang);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
}
