package com.example.demo_orm.Service;

import com.example.demo_orm.Respository.IStudentResp;
import com.example.demo_orm.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private IStudentResp resp;


    @Override
    public List<Student> findAll() {
        return resp.findAll();
    }

    @Override
    public void save(Student student) {
        resp.save(student);

    }
}
