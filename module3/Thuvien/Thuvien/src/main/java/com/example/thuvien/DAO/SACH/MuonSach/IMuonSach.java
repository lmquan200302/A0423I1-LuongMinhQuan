package com.example.thuvien.DAO.SACH.MuonSach;

import com.example.thuvien.Model.Sach;
import com.example.thuvien.Model.Themuonsach;

import java.sql.SQLException;
import java.util.List;

public interface IMuonSach {
    List<Themuonsach> getDanhsachmuonsach();
    void insert(Themuonsach themuonsach) throws SQLException;

}
