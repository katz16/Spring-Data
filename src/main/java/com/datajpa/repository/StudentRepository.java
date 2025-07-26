package com.datajpa.repository;

import com.datajpa.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void addStudent(Student s){
        em.persist(s);
    }
}
