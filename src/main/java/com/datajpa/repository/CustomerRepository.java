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
        //Customer c= new Customer() --> this is new State
        em.persist(c); //Saves customer object in customer table // Managed state
       // c.setAddress("address 108");--Here also the object will be in managed state. If line 20 is uncommented, the address will be updated to 108
        //eventhough we persisted in the line 19.
        //em.getTransaction().commit();
    }
    //After this method call, the object will move to detached stated
    //After addNewCustomer() method, the object will go to detached state
    public void searchById(int id){
        Customer c=em.find(Customer.class,id);
        if(c!=null)
            System.out.println("Customer id is "+c.getCustId()+ " Customer name is "+c.getCustName()+ " Customer address is "+c.getAddress());
        else
            System.out.println("customer doesn't exists !");
    }
    @Transactional
    public void updateAddress(int id, String address){
        Customer c= em.find(Customer.class,id);
        if(c!=null) {
            c.setAddress(address);
            em.refresh(c);
        }
        else
            System.out.println("record doesn't exist !");
    }
}
