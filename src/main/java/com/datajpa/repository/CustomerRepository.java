package com.datajpa.repository;

import com.datajpa.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

//To perform CRUD operation we need the object of Entity Manager
//Entity Manager will manage Entities
@Repository
public class CustomerRepository {
    @PersistenceContext // injects Entity Manager object
    private EntityManager em;
    @Transactional /*This annotation will start and commit the transaction declaratively*/
    public void addNewCustomer(Customer c){
       // em.getTransaction().begin();
        em.persist(c); //Saves customer object in customer table
        //em.getTransaction().commit();
    }
}
