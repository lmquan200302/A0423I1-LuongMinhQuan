package com.example.quanlysinhvien.Reposive;

import com.example.quanlysinhvien.Model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
}
