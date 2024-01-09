package com.example.user.Service;

import com.example.user.DAO.IUserDao;
import com.example.user.DAO.UserDAO;
import com.example.user.Model.User;

import java.util.List;

public class UserSevice implements IUserService{
    private IUserDao userDao = new UserDAO();
    public UserSevice(){
        userDao = new UserDAO();
    }

    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }
}
