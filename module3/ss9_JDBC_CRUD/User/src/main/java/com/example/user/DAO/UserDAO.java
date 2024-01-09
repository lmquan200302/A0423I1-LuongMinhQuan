package com.example.user.DAO;

import com.example.user.Model.User;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDao {

    private static final String URL = "Jdbc:mysql://localhost:3306/userdb";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    //cau truy van sql
    private static final String INSERT_USERS_SQL = "insert into users" + "(name,email,country)values" + "(?,?,?)";
    private static final String UPDATE_USERS_SQL = "update users set name=?, email=?, country=? where id=?";
    private static final String SELECT_USERS_BY_ID = "select * from users where id = ?";
    private static final String SELECT_USERS_BY_COUNTRY = "select * from users where country = ?";
    private static final String DELETE_USERS_BY_ID = "delete from users where id = ?";
    private static final String SELECT_ALL_USERS_SQL = "select * from users";


    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Không thể kết nối đến cơ sở dữ liệu", e);
        }
    }

    public List<User> selectAllUser() {
        List<User> userList = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS_SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
             userList.add(new User(id,name,email,country));


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userList;
    }


    @Override
    public List<User> finfAllByName(String nameSearch) {
    List<User> userList = new ArrayList<>();
    String select_byname = "select * from users where name = ?";
    try(Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(select_byname))
    {
        statement.setString(1, nameSearch);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setEmail(resultSet.getString("email"));
            user.setCountry(resultSet.getString("country"));
            userList.add(user);
        }
    } catch (SQLException e) {
        System.out.println("Loi truy van CSDL");
    }
    return userList;
    }


    public void insertUser(User user) throws SQLException {
        try(Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(  INSERT_USERS_SQL)){
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public User selectUser(int id) {
        User user = null;
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERS_BY_ID);
        ) {
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id,name,email,country);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdate;
        try(Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL)){
            statement.setString(1,user.getName());
            statement.setString(2,user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4,user.getId());

            rowUpdate = statement.executeUpdate() > 0;
        }
        return rowUpdate;
    }

    @Override
    public List<User> findByCountry(String countrySearch) {
        List<User> userList = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERS_BY_COUNTRY);
            preparedStatement.setString(1,countrySearch);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    @Override
    public boolean deleteUsers(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_BY_ID);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

}
