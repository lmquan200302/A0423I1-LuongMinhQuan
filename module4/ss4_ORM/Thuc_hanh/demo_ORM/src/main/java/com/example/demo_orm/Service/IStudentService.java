package com.example.demo_orm.Service;

import com.example.demo_orm.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void save(Student student);
}
