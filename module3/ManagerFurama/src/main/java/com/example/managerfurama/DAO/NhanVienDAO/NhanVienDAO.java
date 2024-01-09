package com.example.managerfurama.DAO.NhanVienDAO;

import com.example.managerfurama.Model.NhanVien.NhanVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO implements INhanVien {

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


    public List<NhanVien> selectAllNhanVien() {
        String select_all_NhanVien = "SELECT * FROM nhan_vien"; // tao cau truy ban
        List<NhanVien> nhanVienList = new ArrayList<>(); // tao list
        try {
            Connection connection = getConnection(); // tao ket noi
            PreparedStatement preparedStatement = connection.prepareStatement(select_all_NhanVien); // tao cau truy van
            ResultSet resultSet = preparedStatement.executeQuery(); // tao bien result de luu cau truy van
            while (resultSet.next()){
                int manhanvien = resultSet.getInt("ma_nhan_vien"); //1
                String hoten = resultSet.getString("ho_ten"); //2
                String ngaysinh = resultSet.getString("ngay_sinh"); //3
                String cccd = resultSet.getString("cccd"); //4
                double luong = resultSet.getDouble("luong"); //5
                String sdt = resultSet.getString("sdt"); //6
                String email = resultSet.getString("email"); //7
                String diachi = resultSet.getString("dia_chi"); //8
                int matrinhdo = resultSet.getInt("ma_trinh_do"); //9
                int mavitri = resultSet.getInt("ma_vi_tri"); //10
                int mabophan = resultSet.getInt("ma_bo_phan"); //11
                nhanVienList.add(new NhanVien(manhanvien,hoten,ngaysinh,cccd,luong,sdt,email,diachi,matrinhdo,mavitri,mabophan));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nhanVienList;
    }

    @Override
    public List<NhanVien> selectNameNhanVien(String nameSearch) throws SQLException {
        String SELECT_NHANVIEN_BY_NAME = "SELECT * FROM nhan_vien where ho_ten = ?";
        List<NhanVien> nhanVienList =new ArrayList<>();
        try{
        Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NHANVIEN_BY_NAME);
        preparedStatement.setString(1,nameSearch);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
        NhanVien nhanVien = new NhanVien();
nhanVien.setManhanvien(resultSet.getInt("ma_nhan_vien"));
nhanVien.setHoten(resultSet.getString("ho_ten"));
            nhanVien.setCccd(resultSet.getString("cccd"));
            nhanVien.setLuong(resultSet.getDouble("luong"));
            nhanVien.setSdt(resultSet.getString("sdt"));
            nhanVien.setEmail(resultSet.getString("email"));
            nhanVien.setDiachi(resultSet.getString("dia_chi"));
            nhanVien.setMavitri(resultSet.getInt("ma_vi_tri"));
            nhanVien.setMatrinhdo(resultSet.getInt("ma_trinh_do"));
            nhanVien.setMabophan(resultSet.getInt("ma_bo_phan"));
            nhanVienList.add(nhanVien);
        }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return nhanVienList;
    }

    @Override
    public void insertNhanvien(NhanVien nhanVien) throws SQLException {
String insertNhanvien = "insert into nhan_vien(ma_nhan_vien,ho_ten,ngay_sinh,cccd,luong,sdt,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) values(?,?,?,?,?,?,?,?,?,?,?)";
try{
    Connection connection = getConnection();
    PreparedStatement statement = connection.prepareStatement(insertNhanvien);
    statement.setInt(1,nhanVien.getManhanvien());
    statement.setString(2,nhanVien.getHoten());
    statement.setString(3,nhanVien.getNgaysinh());
    statement.setString(4,nhanVien.getCccd());
    statement.setDouble(5,nhanVien.getLuong());
    statement.setString(6,nhanVien.getSdt());
    statement.setString(7,nhanVien.getEmail());
    statement.setString(8,nhanVien.getDiachi());
    statement.setInt(9,nhanVien.getMavitri());
    statement.setInt(10,nhanVien.getMatrinhdo());
    statement.setInt(11,nhanVien.getMabophan());
    statement.executeUpdate();


} catch (SQLException e) {
    throw new RuntimeException(e);
}
    }

    @Override
    public boolean updateNV(NhanVien nhanVien) throws SQLException {
        String updateNV = "update nhan_vien set ho_ten=?, ngay_sinh=?, cccd=?, luong=?, sdt=?, email=?, dia_chi=?, ma_vi_tri=?, ma_trinh_do=?, ma_bo_phan=? where ma_nhan_vien=?";

        boolean rowUpdate;
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(updateNV);

            preparedStatement.setString(1, nhanVien.getHoten());
            preparedStatement.setString(2, nhanVien.getNgaysinh());
            preparedStatement.setString(3, nhanVien.getCccd());
            preparedStatement.setDouble(4, nhanVien.getLuong());
            preparedStatement.setString(5, nhanVien.getSdt());
            preparedStatement.setString(6, nhanVien.getEmail());
            preparedStatement.setString(7, nhanVien.getDiachi());
            preparedStatement.setInt(8, nhanVien.getMavitri());
            preparedStatement.setInt(9, nhanVien.getMatrinhdo());
            preparedStatement.setInt(10, nhanVien.getMabophan());
            preparedStatement.setInt(11, nhanVien.getManhanvien()); // Chuyển cột 'ma_nhan_vien' xuống đây

            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdate;
    }


    @Override
    public NhanVien selectNhanVien(int manhanvien) {
        String selectNhanVienByMaNhanVien = "select * from nhan_vien where ma_nhan_vien = ?";
        NhanVien nhanVien = null;
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(selectNhanVienByMaNhanVien);
            preparedStatement.setInt(1,manhanvien);
            ResultSet resultSet =preparedStatement.executeQuery();
            while (resultSet.next()){
                int manhanvien1 = resultSet.getInt("ma_nhan_vien");
                String hoten = resultSet.getString("ho_ten");
                String ngaysinh = resultSet.getString("ngay_sinh");
                String cccd = resultSet.getString("cccd");
                double luong = resultSet.getDouble("luong");
                String sdt = resultSet.getString("sdt");
                String email = resultSet.getString("email");
                String diachi = resultSet.getString("dia_chi");
                int mavitri = resultSet.getInt("ma_vi_tri");
                int matrinhdo = resultSet.getInt("ma_trinh_do");
                int mabophan = resultSet.getInt("ma_bo_phan");
                nhanVien = new NhanVien(manhanvien1,hoten,ngaysinh,cccd,luong,sdt,email,diachi,mavitri,matrinhdo,mabophan);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return nhanVien;

    }

    @Override
    public boolean deleteNhanvien(int manhanvien) throws SQLException {
        String DELETE = "delete from nhan_vien where ma_nhan_vien=?";
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE);) {
            statement.setInt(1,manhanvien);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;


    }


}
