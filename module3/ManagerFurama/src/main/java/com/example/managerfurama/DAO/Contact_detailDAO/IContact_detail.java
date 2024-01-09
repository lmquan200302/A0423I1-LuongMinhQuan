package com.example.managerfurama.DAO.Contact_detailDAO;

import com.example.managerfurama.Model.Contact.Contact;
import com.example.managerfurama.Model.Contact_detail.Contact_detail;

import java.sql.SQLException;
import java.util.List;

public interface IContact_detail {
   List<Contact_detail> selectAll();
   void insert(Contact_detail contactDetail) throws SQLException;
}
