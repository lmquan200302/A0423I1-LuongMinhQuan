package com.example.managerfurama.DAO.DichVuDAO;

import com.example.managerfurama.Model.DichVu.DichVu;
import com.example.managerfurama.Model.KhachHang.KhachHang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DichVuDAO implements IDichVu{
    private static final String SELECT_ALL = "SELECT * FROM DICH_VU ";
    private static final String SELECT_NAME = "SELECT * FROM DICH_VU WHERE TEN_DICH_VU=?";
    private static final String INSERT = "INSERT INTO DICH_VU(TEN_DICH_VU,DIEN_TICH,CHI_PHI_CHO_THUE,SO_NGUOI_TOI_DAT,MA_KIEU_THUE,MA_LOAI_DICH_VU,TIEU_CHUAN_PHONG,MO_TA_TIEN_NGHI_KHACH,DIEN_DICH_HO_BOI,SO_TANG)VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE DICH_VU SET TEN_DICH_VU=?, DIEN_TICH=?, CHI_PHI_CHO_THUE=?, SO_NGUOI_TOI_DAT=?, MA_KIEU_THUE=?, MA_LOAI_DICH_VU=?, TIEU_CHUAN_PHONG=?, MO_TA_TIEN_NGHI_KHACH=?, DIEN_DICH_HO_BOI=?, SO_TANG=?  WHERE MA_DICH_VU=?";
    private static final String SELECT_MADV = "SELECT * FROM DICH_VU WHERE MA_DICH_VU=?";
    private static final String DELETE = "DELETE FROM DICH_VU WHERE MA_DICH_VU=?";
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
    public List<DichVu> selectAll() {

        List<DichVu> dichVuList = new ArrayList<>(); // tao list
        try {
            Connection connection = getConnection(); // tao ket noi
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL); // tao cau truy van
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int madv = resultSet.getInt("ma_dich_vu");
                String tendv = resultSet.getString("ten_dich_vu");
                int dientich = resultSet.getInt("dien_tich");
                double chiphichothue = resultSet.getDouble("chi_phi_cho_thue");
                int songuoidat = resultSet.getInt("so_nguoi_toi_dat");
                int makieuthue = resultSet.getInt("ma_kieu_thue");
                int maloaidv = resultSet.getInt("ma_loai_dich_vu");
                String tieuchuan = resultSet.getString("tieu_chuan_phong");
                String mota = resultSet.getString("mo_ta_tien_nghi_khach");
                double dientichhoboi = resultSet.getDouble("dien_dich_ho_boi");
                int sotang = resultSet.getInt("so_tang");

                dichVuList.add(new DichVu(madv,tendv,dientich,chiphichothue,songuoidat,makieuthue,maloaidv,tieuchuan,mota,dientichhoboi,sotang));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dichVuList;
    }

    @Override
    public List<DichVu> selectName(String nameSearch) throws SQLException {

        List<DichVu> dichVuList =new ArrayList<>();
        try{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_NAME);
            preparedStatement.setString(1,nameSearch);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                DichVu dichVu = new DichVu();

                dichVu.setMadichvu(resultSet.getInt("ma_dich_vu"));
                dichVu.setTendichvu(resultSet.getString("ten_dich_vu"));
                dichVu.setDientich(resultSet.getInt("dien_tich"));
                dichVu.setChiphichothue(resultSet.getDouble("chi_phi_cho_thue"));
                dichVu.setSonguoitoidat(resultSet.getInt("so_nguoi_toi_dat"));
                dichVu.setMakieuthue(resultSet.getInt("ma_kieu_thue"));
                dichVu.setMadichvu(resultSet.getInt("ma_loai_dich_vu"));
                dichVu.setTieuchuanphong(resultSet.getString("tieu_chuan_phong"));
                dichVu.setMotatiennghikhac(resultSet.getString("mo_ta_tien_nghi_khach"));
                dichVu.setDientichhoboi(resultSet.getDouble("dien_dich_ho_boi"));
                dichVu.setSotang(resultSet.getInt("so_tang"));


                dichVuList.add(dichVu);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return dichVuList;
    }

    @Override
    public void insert(DichVu dichVu) throws SQLException {
        try{
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement.setString(1,dichVu.getTendichvu());
            statement.setInt(2,dichVu.getDientich());
            statement.setDouble(3,dichVu.getChiphichothue());
            statement.setInt(4,dichVu.getSonguoitoidat());
            statement.setInt(5,dichVu.getMakieuthue());
            statement.setInt(6,dichVu.getMaloaidichvu());
            statement.setString(7,dichVu.getTieuchuanphong());
            statement.setString(8,dichVu.getMotatiennghikhac());
            statement.setDouble(9,dichVu.getDientichhoboi());
            statement.setInt(10,dichVu.getSotang());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean update(DichVu dichVu) throws SQLException {

        boolean rowUpdate;
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setString(1,dichVu.getTendichvu());
            statement.setInt(2,dichVu.getDientich());
            statement.setDouble(3,dichVu.getChiphichothue());
            statement.setInt(4,dichVu.getSonguoitoidat());
            statement.setInt(5,dichVu.getMakieuthue());
            statement.setInt(6,dichVu.getMaloaidichvu());
            statement.setString(7,dichVu.getTieuchuanphong());
            statement.setString(8,dichVu.getMotatiennghikhac());
            statement.setDouble(9,dichVu.getDientichhoboi());
            statement.setInt(10,dichVu.getSotang());
            statement.setInt(11,dichVu.getMadichvu());
            statement.executeUpdate(); // Chuyển cột 'ma_nhan_vien' xuống đây

            rowUpdate = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdate;
    }

    @Override
    public DichVu selectmaDV(int madichvu) {
        return null;
    }

    @Override
    public boolean delete(int madichvu) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE);) {
            statement.setInt(1,madichvu);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    }

