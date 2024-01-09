package com.example.managerfurama.DAO.ContactDAO;

import com.example.managerfurama.Model.Contact.Contact;
import com.example.managerfurama.Model.DichVu.DichVu;

import java.sql.SQLException;
import java.util.List;

public interface IContact {
    List<Contact> selectAll();
    void insert(Contact contact) throws SQLException;
}
