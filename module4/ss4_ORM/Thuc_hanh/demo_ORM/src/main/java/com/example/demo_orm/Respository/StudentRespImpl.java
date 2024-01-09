package com.example.demo_orm.Respository;

import com.example.demo_orm.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class StudentRespImpl implements IStudentResp {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAll() {
        String sql = "SELECT S FROM Student S";
        TypedQuery<Student> query = entityManager.createQuery(sql,Student.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void save(Student student) {
    entityManager.persist(student);
    }
}
