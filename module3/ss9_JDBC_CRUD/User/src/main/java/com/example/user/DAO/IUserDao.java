package com.example.user.DAO;

import com.example.user.Model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
List<User> selectAllUser();
List<User> finfAllByName(String nameSearch);
void insertUser(User user) throws SQLException;
User selectUser(int id);
boolean updateUser(User user) throws SQLException;
List<User> findByCountry(String countrySearch);
boolean deleteUsers(int id) throws SQLException;
}

