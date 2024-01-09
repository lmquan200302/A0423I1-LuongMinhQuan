package com.example.managerfurama.DAO.DichVuDAO;

import com.example.managerfurama.Model.DichVu.DichVu;
import com.example.managerfurama.Model.KhachHang.KhachHang;

import java.sql.SQLException;
import java.util.List;

public interface IDichVu  {
    List<DichVu> selectAll(); // hien thi toan bo danh sach
    List<DichVu> selectName(String nameSearch) throws SQLException; // search theo ten
    void insert(DichVu dichVu) throws SQLException; // them moi
    boolean update(DichVu dichVu) throws SQLException; // chinh sua
    DichVu selectmaDV(int madichvu); //tim theo id

    boolean delete(int madichvu) throws SQLException; //xoa
}
