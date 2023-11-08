package com.example.quanlysinhvien_mvc.Service;

import com.example.quanlysinhvien_mvc.Model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void save(Student student);
     Student finByID(int id);
     void update(int id, Student student);
     void remove(int id);


}
