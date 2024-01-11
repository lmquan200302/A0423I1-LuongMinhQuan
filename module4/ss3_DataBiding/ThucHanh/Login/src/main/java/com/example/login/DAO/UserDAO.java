package com.example.login.DAO;

import com.example.login.Model.Login;
import com.example.login.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    static {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setAccount("lmquan123");
        user1.setPassword("12345");
        user1.setName("Luong Minh Quan");
        user1.setEmail("lmquan@gmail.com");
        userList.add(user1);

        User user2 = new User();
        user1.setAccount("ngoclinh");
        user1.setPassword("abc");
        user1.setName("Nguyen Ngoc Huyen Linh");
        user1.setEmail("linh@gmail.com");
        userList.add(user2);
    }

    public String checkLogin(Login login){
        for(User user : userList)
    }


}
