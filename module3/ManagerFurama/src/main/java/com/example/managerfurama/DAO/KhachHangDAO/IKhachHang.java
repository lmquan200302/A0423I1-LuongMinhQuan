package com.example.managerfurama.DAO.KhachHangDAO;

import com.example.managerfurama.Model.KhachHang.KhachHang;
import com.example.managerfurama.Model.NhanVien.NhanVien;

import java.sql.SQLException;
import java.util.List;

public interface IKhachHang {
    List<KhachHang> selectAll(); // hien thi toan bo danh sach
    List<KhachHang> selectName(String nameSearch) throws SQLException; // search theo ten
    void insert(KhachHang khachHang) throws SQLException; // them moi
    boolean update(KhachHang khachHang) throws SQLException; // chinh sua
    KhachHang selectmaKH(int makhachhang); //tim theo id

    boolean delete(int makhachhang) throws SQLException; //xoa
}
