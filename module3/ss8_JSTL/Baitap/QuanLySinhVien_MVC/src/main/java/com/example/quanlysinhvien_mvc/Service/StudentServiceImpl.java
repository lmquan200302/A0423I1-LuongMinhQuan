package com.example.quanlysinhvien_mvc.Service;

import com.example.quanlysinhvien_mvc.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"Quan","quan@gmail.com","Nam","Quang Nam",9));
        students.add(new Student(2,"Minh","minh@gmail.com","Nam","Da Nang",8));
        students.add(new Student(3,"Linh","linh@gmail.com","Nu","Quang Tri",6));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void save(Student student) {
    students.add(student.getId(),student);
    }

    @Override
    public Student finByID(int id) {
        return students.get(id);
    }

    @Override
    public void update(int id, Student student) {
        students.add(id,student);


    }

    @Override
    public void remove(int id) {
        students.remove(id);

    }
}
