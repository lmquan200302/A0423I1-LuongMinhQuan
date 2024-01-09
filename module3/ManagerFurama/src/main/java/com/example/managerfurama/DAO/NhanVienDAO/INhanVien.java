package com.example.managerfurama.DAO.NhanVienDAO;

import com.example.managerfurama.Model.NhanVien.NhanVien;

import java.sql.SQLException;
import java.util.List;

public interface INhanVien {
    List<NhanVien> selectAllNhanVien();
    List<NhanVien> selectNameNhanVien(String nameSearch) throws SQLException;
    void insertNhanvien(NhanVien nhanVien) throws SQLException;
    boolean updateNV(NhanVien nhanVien) throws SQLException;
    NhanVien selectNhanVien(int manhanvien);

    boolean deleteNhanvien(int manhanvien) throws SQLException;
}
