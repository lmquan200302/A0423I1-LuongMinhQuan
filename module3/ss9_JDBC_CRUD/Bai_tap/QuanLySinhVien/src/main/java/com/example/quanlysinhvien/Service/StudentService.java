package com.example.quanlysinhvien.Service;

import com.example.quanlysinhvien.Model.Student;
import com.example.quanlysinhvien.Reposive.IStudentRepository;
import com.example.quanlysinhvien.Reposive.StudentRepository;

import java.util.List;

public class StudentService implements StudentServiceImpl {
    private IStudentRepository iStudentRepository = new StudentRepository();


    @Override
    public List<Student> getAll() {
        return iStudentRepository.findAll();

    }
}
