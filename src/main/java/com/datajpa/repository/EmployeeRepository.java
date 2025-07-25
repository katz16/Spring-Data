package com.datajpa.repository;

import com.datajpa.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void addNewEmployee(Employee e){
        em.persist(e);
    }
    @Transactional
    public void searchEmployeeById(int id){
        Employee e= em.find(Employee.class,id);
        if(e!=null)
            System.out.println(e.getEmpName());
        else
            System.out.println("Employee does not exist !");
    }

    public void allEmps(){
        String jpql="SELECT emp FROM Employee emp"; //jpql- Java Persistence Query Language
        Query q= em.createQuery(jpql);
        List<Employee> list=q.getResultList();
        list.forEach(e-> System.out.println(e.getEmpName()));
    }

    public void searchEmployeeByPlace(String place){
        //to dynamically pass parameter use :p in query
        //:p- paramname
        //set this paramname and value in query
        String jpql="select emp from Employee emp where emp.address.placeName=:p";
        Query q= em.createQuery(jpql);
        q.setParameter("p",place);
        List<Employee>list=q.getResultList();
        list.forEach(l-> System.out.println(l.getEmpName()));
    }
}
