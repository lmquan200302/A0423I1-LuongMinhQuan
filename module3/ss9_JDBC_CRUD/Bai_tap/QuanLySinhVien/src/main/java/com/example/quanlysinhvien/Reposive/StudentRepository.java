package com.example.quanlysinhvien.Reposive;

import com.example.quanlysinhvien.Model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements  IStudentRepository{
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        Student student;
        try{
            try {
                Statement statement = BaseRepository.getConnectionJavaToDB().createStatement();
                ResultSet resultSet = statement.executeQuery("select * from student");
                while (resultSet.next()){
                    student = new Student();
                    student.setId(resultSet.getInt("StudentId"));
                    student.setName(resultSet.getString("StudentName"));
                    student.setAddress(resultSet.getString("Address"));
                    student.setPhone(resultSet.getString("Phone"));
                    student.setStatus(resultSet.getBoolean("Status"));
                    student.setClass_id(resultSet.getInt("ClassId"));
                    studentList.add(student);
                }
            } catch (SQLException e) {
                System.out.println("Loi ket noi DataBase");
            }
            return studentList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    }

