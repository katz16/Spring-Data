package com.datajpa.repository;

import com.datajpa.entity.Address;
import com.datajpa.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void addStudent(Student s){
        em.persist(s);
    }
    @Transactional
    public void searchById(int id){
        Student s= em.find(Student.class, id);
        List<Address>list=s.getAddress();
        for(Address a:list){
            System.out.println("Address is "+a.getDoorNo()+" "+a.getPlaceName()+" "+a.getPinCode());
        }
        if(s!=null){
            System.out.println("Student found with id "+id+" is "+s.getStudName());

        }else{
            System.out.println("No student found with id "+id);
        }
    }
}
