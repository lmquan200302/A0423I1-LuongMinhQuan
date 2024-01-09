package com.example.benhvien.DAO;

import com.example.benhvien.Model.Benhan;

import java.sql.SQLException;
import java.util.List;

public interface IBenhAn {
    List<Benhan> selectAll();
    boolean update(Benhan benhan) throws SQLException;
    Benhan selectMabenhan(int mabenhan);
    boolean delete(int mabenhan) throws SQLException;

}
