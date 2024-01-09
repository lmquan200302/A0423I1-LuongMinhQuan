package com.example.demo_orm.Respository;

import com.example.demo_orm.model.Student;

import java.util.List;

public interface IStudentResp {
    List<Student> findAll();
    public void save(Student student);
}
